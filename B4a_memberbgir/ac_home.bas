B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=7.3
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
	#Extends: android.support.v7.app.AppCompatActivity
	
#End Region

Sub Process_Globals
	Private sql1 As SQL
	Private cursor1 As Cursor
    
	

End Sub

Sub Globals
	Dim meno As Label
	Dim pnl_coins As Panel
	Dim lbl_icon ,lbl_nums As Label
    Dim roundview As MC7RoundView
	Dim LV As Hitex_LayoutView
	Dim glide As Hitex_Glide
	Dim i_username ,i_pk,i_cookie,i_pic As String
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	''''''''''''''''''''''''''''''''''''''''db
	If File.Exists(File.DirInternal,"instadb.db")=False Then
		File.Copy(File.DirAssets,"instadb.db",File.DirInternal,"instadb.db")
	End If
	If sql1.IsInitialized=False Then
		sql1.Initialize(File.DirInternal,"instadb.db",False)
	
	End If
	''''''''''''''''''''''''''''''''''''''''
	
	cursor1 = sql1.ExecQuery("SELECT * FROM tbl_acc WHERE soich='1' ")
	Dim i As Int
	For i=0 To cursor1.RowCount-1
		cursor1.Position=i
		i_cookie=cursor1.GetString("cookie")
		i_username=cursor1.GetString("username")
		i_pk=cursor1.GetString("pk")
		i_pic=cursor1.GetString("profile_pic_url")
	Next
	
	
	Dim Gradient1 As GradientDrawable
	Dim Clrs(6) As Int
	Clrs(0) = 0xFFFF00AE
	Clrs(1) = 0xFFEE2CB0
'	Clrs(2) = 0xFFDB42AA
'	Clrs(0) = 0xFFDD73BB
'	Clrs(1) = 0xFFF6ABDE
'	Clrs(2) = 0xFFFFF0FA
	
	Clrs(2) = 0xFF0E85F6
	Clrs(3) = 0xFF2E95F6
	Clrs(4) = 0xFF409DF6
	Clrs(5) = 0xFF57A3EC
'	Clrs(10) = 0xFF94CBFF
	
	Gradient1.Initialize("TOP_BOTTOM", Clrs)
	Activity.Background=Gradient1
	
	Dim bkcolor As ColorDrawable
	bkcolor.Initialize2(Colors.White,15,2dip,Colors.LightGray)
	meno.Initialize("meno")
	meno.TextColor=Colors.DarkGray
	meno.TextSize=37
	meno.Background=bkcolor
	meno.Typeface=Typeface.MATERIALICONS
	meno.Text=Chr(0xE3C7)
	meno.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	Activity.AddView(meno,3%x,3%x,12%x,12%x)
	
	pnl_coins.Initialize("pnl_coins")
	pnl_coins.Visible=False
	Activity.AddView(pnl_coins,50%x,3%x,50%x,12%x)
	roundview.Initialize(pnl_coins)
	roundview.CornerRadius_BL=10%x
	roundview.CornerRadius_TL=10%x
	roundview.BackgroundColor=Colors.White
	
	Dim bkcolor_st As ColorDrawable
	bkcolor_st.Initialize2(0xFFC67D00,50,4dip,0x82FFE300)
	
	Dim pnlb1 As Panel
	pnlb1.Initialize("")
	pnlb1.Color=0xFFFFC300
	pnlb1.Background=bkcolor_st
	pnl_coins.AddView(pnlb1,pnl_coins.Width-11%x,1%x,10%x,pnl_coins.Height-2%x)
	
	lbl_icon.Initialize("lbl_icon")
	lbl_icon.SetBackgroundImage(LoadBitmap(File.DirAssets,"coins.png"))
	pnl_coins.AddView(lbl_icon,pnl_coins.Width-9%x,pnl_coins.Height/2/2,pnl_coins.Height/2,pnl_coins.Height/2)
	
	lbl_nums.Initialize("lbl_nums")
	lbl_nums.TextColor=Colors.DarkGray
	lbl_nums.TextSize=20
	lbl_nums.Typeface=Typeface.LoadFromAssets("iran_sans.ttf")
	lbl_nums.Text=0&" سکه"
	lbl_nums.Gravity=Gravity.CENTER_VERTICAL+Gravity.RIGHT
	pnl_coins.AddView(lbl_nums,2%x,0,pnl_coins.Width-15%x,pnl_coins.Height)
	
	LV.Initializer("LV").ListView.Build
	Activity.AddView(LV,0,10%y,100%x,90%y)
	LV.Ripple.Color(0xFF5E23DE).Alpha(0.2f).Duration(350)
	LV.Show
	
	
'	req_getme("")
	

'    Mdmenos.addpnl
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub LV_onCreateViewHolder (Parent As Panel, ViewType As Int)      '# onCreate #'
	
	Parent.Color=Colors.Transparent
	
	Dim bkcolors As ColorDrawable
	bkcolors.Initialize(Colors.White,3%x)
	
	Dim pnl_main As Panel : pnl_main.Initialize("pnl_main")
	pnl_main.Color=Colors.White
	pnl_main.Background=bkcolors
	Parent.AddView(pnl_main,5%x,2%x,90%x,35%x)
	
	Dim lbl_itemicon As Label
	lbl_itemicon.Initialize("lbl_itemicon")
	lbl_itemicon.TextColor=0xFFD305BA
	lbl_itemicon.TextSize=40
	lbl_itemicon.Typeface=Typeface.FONTAWESOME
	lbl_itemicon.Gravity=Gravity.CENTER_VERTICAL+Gravity.CENTER_HORIZONTAL
	pnl_main.AddView(lbl_itemicon,0,3%x,pnl_main.Width,17%x)
	
	Dim lbl_name As Label
	lbl_name.Initialize("lbl_name")
	lbl_name.TextColor=Colors.DarkGray
	lbl_name.TextSize=17
	lbl_name.Typeface=Typeface.LoadFromAssets("iran_sans.ttf")
	lbl_name.Gravity=Gravity.CENTER_VERTICAL+Gravity.CENTER_HORIZONTAL
	pnl_main.AddView(lbl_name,0,lbl_itemicon.Top+lbl_itemicon.Height,pnl_main.Width,11%x)
	
	Dim bkcolor As ColorDrawable
	bkcolor.Initialize(0xFFFFD82B,30)
	Dim lbl_notis As Label
	lbl_notis.Initialize("lbl_notis")
	lbl_notis.TextColor=Colors.DarkGray
	lbl_notis.TextSize=17
	lbl_notis.Typeface=Typeface.LoadFromAssets("iran_sans.ttf")
	lbl_notis.Text="با قیمت مناسب و کیفیت تضمینی !"
	lbl_notis.Gravity=Gravity.CENTER_VERTICAL+Gravity.CENTER_HORIZONTAL
'	lbl_notis.Background=bkcolor
	pnl_main.AddView(lbl_notis,1%x,lbl_name.Top+lbl_name.Height,pnl_main.Width-2%x,9%x)
	
	lbl_name.Text="فالوور بگیر"
	lbl_itemicon.Text=Chr(0xE8D3)
	
	roundview.Initialize(lbl_notis)
	roundview.CornerRadius_BL=30
	roundview.CornerRadius_BR=30
	roundview.CornerRadius_TL=30
	roundview.CornerRadius_TR=30
	roundview.BackgroundColor=0xFFFFD82B
	pnl_main.Height=lbl_notis.Top+lbl_notis.Height+5%x
End Sub

Sub LV_onBindViewHolder (Parent As Panel, Position As Int)         '* onBind *'
	Dim pnl_main = Parent.GetView(0) As Panel
	Dim lbl_itemicon = pnl_main.GetView(0) As Label
	Dim lbl_name = pnl_main.GetView(1) As Label
'	
	Dim lbl_notis = pnl_main.GetView(2) As Label
'
	Select Position
		Case 0:
			lbl_name.Text="اینستاگرام"
			lbl_notis.Text="فالوور-لایک-کامنت-ویو"
			lbl_itemicon.Text=Chr(0xF16D)
			
		Case 1:
			lbl_name.Text="تلگرام"
			lbl_notis.Text="ممبر - بازدید"
			lbl_itemicon.Text=Chr(0xF2C6)
			lbl_itemicon.TextColor=0xFF0099FF
		Case 2:
			lbl_name.Text="آنفالووریاب"
			lbl_notis.Text="چه کسانی شما رو آنفالو کرده اند؟"
			lbl_itemicon.Text=Chr(0xE5CD)
		Case 3:
			lbl_name.Text="سفارشات"
			lbl_notis.Text="پیگیری سفارشات"
			lbl_itemicon.Text=Chr(0xE06D)
	End Select
	lbl_notis.Top=pnl_main.Height-10%x
	Parent.Height=pnl_main.Height+10%x
End Sub

Sub LV_GetItemCount As Int 								        '$ ItemCount $'
	Return 2 'ItemList.Size
End Sub

Sub LV_ItemClick (ClickedItem As Panel, Position As Int)		'👆 ItemClick 👆'
	Sleep(0)
	Select Position
		Case 0:
			cursor1 = sql1.ExecQuery("SELECT * FROM tbl_acc")
			If cursor1.RowCount=0 Then
				Log("nist")
'				StartActivity(ac_login)
				SetAnimation("anim3", "anim4")
		
				Activity.Finish
			Else
				Log("hast")
			
'				StartActivity(ac_igram)
				SetAnimation("anim3", "anim4")
		
				Activity.Finish
			End If
'			StartActivity(ac_igram)
'			Sleep(0)
			
			SetAnimation("anim3", "anim4")
		Case 1:
			
			cursor1 = sql1.ExecQuery("SELECT * FROM tbl_tele WHERE soich='1'")
			If cursor1.RowCount=0 Then
				Log("nist")
				StartActivity(ac_telelogin)
				SetAnimation("anim3", "anim4")
		
				Activity.Finish
			Else
				Log("hast")
			
				StartActivity(ac_telelogin)
				SetAnimation("anim3", "anim4")
		
				Activity.Finish
			End If
			
'			StartActivity(ac_icoin)
			SetAnimation("anim2", "anim1")
			
		Case 2:
'			ac_sef.typ_sef=2
'			StartActivity(ac_sef)
'			SetAnimation("anim2", "anim1")
			
		Case 3:
'			ac_sef.typ_sef=1
'			StartActivity(ac_sef)
'			SetAnimation("anim2", "anim1")
	End Select
'	SetAnimation("anim1", "anim2")
	
End Sub

Sub SetAnimation(InAnimation As String, OutAnimation As String)
	Dim r As Reflector
	Dim package As String
	Dim In, out As Int
	package = r.GetStaticField("anywheresoftware.b4a.BA", "packageName")
	In = r.GetStaticField(package & ".R$anim", InAnimation)
	out = r.GetStaticField(package & ".R$anim", OutAnimation)
	r.Target = r.GetActivity
	r.RunMethod4("overridePendingTransition", Array As Object(In, out), Array As String("java.lang.int", "java.lang.int"))
End Sub


Sub req_getme(userid As String)
	Dim prfn As PersianFastNetwork
	prfn.initialize("prfn")

	Dim post As PostRequest
	post=prfn.BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/req.php","getinsta")
	
	post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")

	post.addParametrs("ui","1")
	post.addParametrs("userid",i_pk)

	post.addParametrs("req","get_acci")
	

	post.executRequestAsString
End Sub

Sub prfn_onPostStringErrorListener(Error As ResponseError , Tag As String)
'	Log(Error.ErrorBody)
	ProgressDialogHide
End Sub

Sub prfn_onPostStringOkListener(Result As String  , Tag As String)
'	Log(Result)
	Select Tag
		Case "iuser":
			ProgressDialogHide
			Log(Result)
			
		Case "getinsta":
			Log(Result)
			Dim parser As JSONParser
			parser.Initialize(Result)
			Dim root As List = parser.NextArray
			For Each colroot As Map In root
				Dim Result As String = colroot.Get("result")
				Dim c_m As String = colroot.Get("c_m")
				Dim uid As String = colroot.Get("uid")
				Dim id As String = colroot.Get("id")
				Dim c_f As String = colroot.Get("c_f")
				Dim pic As String = colroot.Get("pic")
				Dim userid As String = colroot.Get("userid")
				Dim username As String = colroot.Get("username")
				Log(c_f)
				Dim n_coins=c_m As Long
				If n_coins>100 Then
					lbl_nums.Text="سکه "&NumberFormat(c_m,3,0)
					Else
					lbl_nums.Text="سکه "&c_m
				End If
'				lbl_fcoin.Text=NumberFormat(c_f,3,0)
				
				sql1.ExecNonQuery("UPDATE tbl_coin set cm='"&c_m&"',cf='"&c_f&"' WHERE userid='"&i_pk&"' ")
			Next
			''			lbl_fcoin.Text=c_f
'			lbl_fcoin.Text="salam"
		
	End Select
End Sub

Sub meno_Click
	Dim mimeno As mi_meno
	
	mimeno.Initialize("mimeno",Me)
	mimeno.addpnl
	mimeno.open
End Sub