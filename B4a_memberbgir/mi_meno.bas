B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.3
@EndOfDesignText@
Sub Class_Globals
	Private Ev As String
	Private obj As Object
	
	Dim MDB As MSMaterialDrawerBuilder
	Dim MD As MSMaterialDrawer
	Private sql1 As SQL
	Private cursor1 As Cursor
	Dim telegs As milad_telegramv3
	Dim username_t ,userid_t As String
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(EventName As String,Module As Object)
	Ev = EventName
	obj = Module
	If File.Exists(File.DirInternal,"instadb.db")=False Then
		File.Copy(File.DirAssets,"instadb.db",File.DirInternal,"instadb.db")
	End If
	If sql1.IsInitialized=False Then
		sql1.Initialize(File.DirInternal,"instadb.db",False)
	
	End If
	''''''''''''''''''''''''''''''''''''''''
'	cursor1 = sql1.ExecQuery("SELECT * FROM tbl_acc ")
'	If cursor1.ColumnCount=0 Then
'		StartActivity(ac_accs)
'		Activity.Finish
'	End If
'	cursor1.Close
	
	
	cursor1 = sql1.ExecQuery("SELECT * FROM tbl_tele WHERE soich='1'")
	Dim i As Int
	For i=0 To cursor1.RowCount-1
		cursor1.Position=i
		userid_t=cursor1.GetString("userid")
		username_t=cursor1.GetString("username")
	Next
	
End Sub


Sub addpnl
	
	
	Dim msa As MSAccountHeaderBuilder
	Dim HeaderBackground As BitmapDrawable
	HeaderBackground.Initialize(LoadBitmap(File.DirAssets,"iconmember.png"))
	msa.Initialize("MSA")
'	msa.addProfiles(Profiles)
	msa.withHeaderBackground(HeaderBackground)
	Dim MaterialHeaderResult As Object = msa.build
	
	Dim p1 As MSIconicDrawable : p1.Initialize("gmd_shop")  : p1.Color = 0xFF1C1B1C
	Dim p2 As MSIconicDrawable : p2.Initialize("gmd_account_child"): p2.Color = 0xFF1C1B1C
	Dim p3 As MSIconicDrawable : p3.Initialize("gmd_lock_open"): p3.Color = 0xFF1C1B1C
	
	Dim s1 As MSIconicDrawable : s1.Initialize("faw_heart") : s1.Color = 0xFF1C1B1C
	Dim s2 As MSIconicDrawable : s2.Initialize("gmd_call_made") : s2.Color = 0xFF1C1B1C
	
	
	Dim s6 As MSIconicDrawable :  s6.Initialize("faw_code") : s6.Color = 0xFF1C1B1C
	
	Dim s3 As MSIconicDrawable :  s3.Initialize("gmd_info") : s3.Color = 0xFF1C1B1C
	
	Dim p11 As MSIconicDrawable : p11.Initialize("gmd_person")  : p1.Color = 0xFF1C1B1C
	Dim p21 As MSIconicDrawable : p21.Initialize("gmd_forum"): p2.Color = 0xFF1C1B1C 'nazar
	Dim p31 As MSIconicDrawable : p31.Initialize("gmd_phone_android"): p3.Color = 0xFF1C1B1C
	Dim s11 As MSIconicDrawable : s11.Initialize("gmd_exit_to_app") : s1.Color = 0xFF1C1B1C
	
	
	MDB.Initialize("MD")
	MDB.withAccountHeader(MaterialHeaderResult)
	'MDB.withHeader(pnlHdr, -1, 80dip)
	
	MDB.AddSecondaryDrawerItem("درباره ی ما"     ,s3.Drawable ,Null ,""    ,True ,0)
	MDB.AddSecondaryDrawerItem("ارتباط با پشتیبان"     ,p11.Drawable ,Null ,""    ,True ,1)
	MDB.AddSecondaryDrawerItem("خروج از حساب کاربری"   ,s11.Drawable ,Null ,""    ,True,2)
	MDB.AddSecondaryDrawerItem("خروج"   ,s11.Drawable ,Null ,""    ,True,3)
	MDB.AddSecondaryDrawerItem("موفق باشید!"       ,Null        ,Null ,""    ,False,3)
	MDB.withDrawerGravity(Gravity.LEFT)
	MDB.withTransluscentStatusbar(False)
	
	MD = MDB.Build
	
	''''''''''''''''''''''''''''''''''''''''
End Sub
	

Sub MD_ItemClick(Position As Int, Identifier As Int)
	Log("Clicked:" & Position & " Iden:" & Identifier)
	
	If Position = 0 Then 'darbare
		Dim Builder As MaterialDialogBuilder
		Builder.Initialize("Dialog")
		Dim str As String
		str=$"
		خدمات ویژه پیشرو ممبر بگیر
		ممبر واقعی و ایرانی 
		:« در این روش ممبرهای کاملا انلاین و
		 ایرانی در کانال شما عضو میشوند و
		 از کیفیت مطلوبی برخوردار هستند و
		 متناسب ترین قیمت را داراست
		
		پشتیبانی بهترین نوع افزایش ممبر کانال میباشد
		 چرا که کاربران با اختیار خود
		 در کانال شما عضو خواهند شد
		"$
		Builder.Content(str).Title("درباره ما")
		
		Builder.ItemsCallback
		Builder.Show
	End If
	
	If Position = 1 Then 'poshtibani
	
		Dim Builder As MaterialDialogBuilder
		Builder.Initialize("Dialog")
		Dim str As String
		str=$"
		جهت ارتباط با ما 
		aaaa@gmail.com
		
		"$
		Builder.Content(str).Title("پشتیبانی")
		
		Builder.ItemsCallback
		Builder.Show
	End If
	
	If Position = 2 Then
'		ExitApplication
		ToastMessageShow("باموفقیت خارج شدید",False)
		telegs.logOut()
		sql1.ExecNonQuery("Delete FROM tbl_tele WHERE username='"&username_t&"'")
		StartActivity(ac_home)
	End If
	If Position = 3 Then
		'''''''aboute me
		Try
'			Dim intent1 As Intent
'			intent1.Initialize(intent1.ACTION_EDIT,"bazaar://details?id=com.insta.bots")
'			StartActivity(intent1)
			ExitApplication
		Catch
			Log(LastException)
		End Try
		
	End If
	
	If Position = 4 Then
'		StartActivity(ac_gifts)
'		Activity.Finish
	End If
	
	If Position = 5 Then
'		StartActivity(ac_moaref)
'		Activity.Finish
	End If
	
	If Position = 6 Then
	
'		Activity.Finish
'		ExitApplication
	End If
	
End Sub
	
Sub open
	MD.OpenDrawer
		
End Sub