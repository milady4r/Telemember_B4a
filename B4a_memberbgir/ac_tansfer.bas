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
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Private sql1 As SQL
	Private cursor1 As Cursor
	Dim type_s As Int
End Sub

Sub Globals
	
	Dim meno As Label
	Dim pnl_coins As Panel
	Dim lbl_icon ,lbl_nums As Label
	Dim roundview As MC7RoundView
	Dim username_t ,userid_t As String
	Dim i_username ,i_pk,i_cookie,i_pic As String
	Dim edit_nums As EditText
	Dim edit_target As EditText
	Dim mtoast As KJ_MaterialToast
	Private progressDialog As MaterialDialog
    Dim bg1 As ColorDrawable
	Dim mimeno As mi_meno
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
'	mimeno.Initialize("mimeno",Me)
'	mimeno.addpnl
	
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
	
	'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
	
	If File.Exists(File.DirInternal,"instadb.db")=False Then
		File.Copy(File.DirAssets,"instadb.db",File.DirInternal,"instadb.db")
	End If
	If sql1.IsInitialized=False Then
		sql1.Initialize(File.DirInternal,"instadb.db",False)
	
	End If
	
	''''''''''''''''''''''''''''''''''''''''
	
	Select type_s
		Case 0:
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
			Dim Clrs(2) As Int
			Clrs(0) = 0xFFD91A99
			Clrs(1) = 0xFFA91AD9
			Gradient1.Initialize("TOP_BOTTOM", Clrs)
			Activity.Background=Gradient1
	
			req_insta(i_pk)
			bg1.Initialize(0xFFBC11C6,2%x)
			
		Case 1:
			
			Dim Gradient1 As GradientDrawable
			Dim Clrs(5) As Int
			Clrs(0) = 0xFFe8eaf6
			Clrs(1) = 0xFFe8eaf6
			Clrs(2) = 0xFFe8eaf6
			Clrs(3) = 0xFF283593
			Clrs(4) = 0xFF283593
	
			Gradient1.Initialize("TOP_BOTTOM", Clrs)
			Activity.Background=Gradient1
			
			
			cursor1 = sql1.ExecQuery("SELECT * FROM tbl_tele WHERE soich='1'")
			Dim i As Int
			For i=0 To cursor1.RowCount-1
				cursor1.Position=i
				userid_t=cursor1.GetString("userid")
				username_t=cursor1.GetString("username")
			Next
			req_tele("")
			bg1.Initialize(0xFF1D69C6,2%x)
			
			
			
			
			
	End Select
	
	
	Dim card As CardView
	card.Initialize("card")
	card.Color=Colors.White
	card.CornerRadius=3%x
	Activity.AddView(card,3%x,20%x,100%x-6%x,10dip)
	
	Dim pnl_card As Panel
	pnl_card.Initialize("pnl_card")
	pnl_card.Color=Colors.White
	card.AddView(pnl_card,0,0,card.Width,card.Height)
	
	Dim lbl_a As Label
	lbl_a.Initialize("lbl_a")
	lbl_a.TextColor=Colors.DarkGray
	lbl_a.TextSize=18
	lbl_a.Typeface=Typeface.LoadFromAssets("iran_sans.ttf")
	lbl_a.Text="انتقال سکه"
	lbl_a.Gravity=Gravity.CENTER_VERTICAL+Gravity.CENTER_HORIZONTAL
	pnl_card.AddView(lbl_a,5%x,0,pnl_card.Width-10%x,15%x)
	
	Dim lbl_cc As Label
	lbl_cc.Initialize("lbl_cc")
	lbl_cc.TextColor=Colors.DarkGray
	lbl_cc.TextSize=14
	lbl_cc.Typeface=Typeface.LoadFromAssets("iran_sans.ttf")
	Select type_s
		Case 0:
			lbl_cc.Text="کد کاربری شما : "&i_pk
			
		Case 1:
			lbl_cc.Text="کد کاربری شما : "&userid_t
			
	End Select
	lbl_cc.Gravity=Gravity.CENTER_VERTICAL+Gravity.CENTER_HORIZONTAL
	pnl_card.AddView(lbl_cc,5%x,lbl_a.Top+lbl_a.Height+1%x,pnl_card.Width-10%x,15%x)
	
	
	Dim bg As ColorDrawable
	bg.Initialize2(Colors.Transparent,5%x,2dip,Colors.LightGray)
	edit_target.Initialize("edit_target")
	edit_target.TextColor=Colors.DarkGray
	edit_target.TextSize=14
	edit_target.Typeface=Typeface.LoadFromAssets("iran_sans.ttf")
	edit_target.Gravity=Gravity.CENTER_VERTICAL+Gravity.CENTER_HORIZONTAL
	edit_target.Hint="کد کاربری مورد نظر شما"
	edit_target.HintColor=Colors.LightGray
	edit_target.Background=bg
	edit_target.InputType=edit_target.INPUT_TYPE_NUMBERS
	pnl_card.AddView(edit_target,5%x,lbl_cc.Top+lbl_cc.Height+5%x,pnl_card.Width-10%x,12%x)
	
	Dim bg As ColorDrawable
	bg.Initialize2(Colors.Transparent,5%x,2dip,Colors.LightGray)
	
	edit_nums.Initialize("edit_nums")
	edit_nums.TextColor=Colors.DarkGray
	edit_nums.TextSize=14
	edit_nums.Typeface=Typeface.LoadFromAssets("iran_sans.ttf")
	edit_nums.Gravity=Gravity.CENTER_VERTICAL+Gravity.CENTER_HORIZONTAL
	edit_nums.Hint="تعداد سکه های مورد نیاز جهت انتقال"
	edit_nums.HintColor=Colors.LightGray
	edit_nums.Background=bg
	edit_nums.InputType=edit_nums.INPUT_TYPE_NUMBERS
	pnl_card.AddView(edit_nums,5%x,edit_target.Top+edit_target.Height+5%x,pnl_card.Width-10%x,12%x)
	
	
	Dim lbl_send As Label
	lbl_send.Initialize("lbl_send")
	lbl_send.TextColor=Colors.White
	lbl_send.TextSize=17
	lbl_send.Typeface=Typeface.LoadFromAssets("iran_sans.ttf")
	lbl_send.Text="انجام انتقال سکه"
	lbl_send.Background=bg1
	lbl_send.Gravity=Gravity.CENTER_VERTICAL+Gravity.CENTER_HORIZONTAL
	pnl_card.AddView(lbl_send,5%x,edit_nums.Top+edit_nums.Height+5%x,pnl_card.Width-10%x,12%x)
	
	pnl_card.Height=lbl_send.Top+lbl_send.Height+5%x
	card.Height=pnl_card.Height
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub lbl_send_Click
	If edit_target.Text="" Then
		
		mtoast.Initialize("فیلد کاربر مورد نظر نمی تواند خالی باشد",mtoast.LENGTH_SHORT,mtoast.TYPE_INFO)
		Return
	End If
	
	If edit_nums.Text="" Then
		
		mtoast.Initialize("فیلد تعداد سکه نمی تواند خالی باشد",mtoast.LENGTH_SHORT,mtoast.TYPE_INFO)
		Return
	End If
	
	Select type_s
		Case 0:
			req_tarns(i_pk,edit_target.Text,edit_nums.Text,"0")
			
			Dim Builder As MaterialDialogBuilder
			Builder.Initialize("Dialog")
			Builder.Title("انتقال سکه")
			Builder.Content("درحال ثبت ...")
			Builder.Progress(True, 0)
			Builder.ProgressIndeterminateStyle(True)
			progressDialog = Builder.Show
			
		Case 1:
			req_tarns(userid_t,edit_target.Text,edit_nums.Text,"1")
			Dim Builder As MaterialDialogBuilder
			Builder.Initialize("Dialog")
			Builder.Title("انتقال سکه")
			Builder.Content("درحال ثبت ...")
			Builder.Progress(True, 0)
			Builder.ProgressIndeterminateStyle(True)
			progressDialog = Builder.Show
	End Select
	
	
	
End Sub

Sub req_tarns(useridx As String,targetx As String,numsx As String,typex As String)
	Dim prfn As PersianFastNetwork
	prfn.initialize("prfn")

	Dim post As PostRequest
	post=prfn.BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/req.php","tansfer")
	
	post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")

	post.addParametrs("userid",useridx)
	post.addParametrs("target",targetx)
	post.addParametrs("nums",numsx)
	post.addParametrs("type",typex)
	

	post.addParametrs("req","transfer_coins")
	

	post.executRequestAsString
End Sub

Sub req_tele(userid As String)
	Dim prfn As PersianFastNetwork
	prfn.initialize("prfn")

	Dim post As PostRequest
	post=prfn.BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/req.php","gettele")
	
	post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")

	post.addParametrs("ui","1")
	post.addParametrs("userid",userid_t)

	post.addParametrs("req","get_acct")
	

	post.executRequestAsString
End Sub


Sub req_insta(userid As String)
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
	Log(Result)
	Select Tag
		Case "iuser":
			ProgressDialogHide
			
		Case "gettele":
			Dim parser As JSONParser
			parser.Initialize(Result)
			Dim root As List = parser.NextArray
			For Each colroot As Map In root
				Dim Result As String = colroot.Get("result")
				Dim c_m As String = colroot.Get("c_m")
				Dim uid As String = colroot.Get("uid")
				Dim first_last As String = colroot.Get("first_last")
				Dim id As String = colroot.Get("id")
				Dim userid As String = colroot.Get("userid")
				Dim username As String = colroot.Get("username")
				Dim c_ch As String = colroot.Get("c_ch")
				Dim n_coins=c_m As Long
				If n_coins>100 Then
					lbl_nums.Text="سکه "&NumberFormat(c_m,3,0)
				Else
					lbl_nums.Text="سکه "&c_m
				End If
'				lbl_fcoin.Text=NumberFormat(c_f,3,0)
				
				sql1.ExecNonQuery("UPDATE tbl_coin set cm='"&c_m&"',cf='"&c_ch&"' WHERE userid='"&userid_t&"' ")
			Next
			
		Case "getinsta":
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
			
		Case "tansfer":
			progressDialog.Hide
			
			Dim parser As JSONParser
			parser.Initialize(Result)
			Dim root As List = parser.NextArray
			For Each colroot As Map In root
				
				Dim statusx As String = colroot.Get("status")
				Dim isuserx As String = colroot.Get("isuser")
				Dim mojodix As String = colroot.Get("mojodi")
			    
				If isuserx="ok" Then
					
					If mojodix="ok" Then
						mtoast.Initialize("با موفقیت انتقال یافت",mtoast.LENGTH_SHORT,mtoast.TYPE_SUCCESS)
						
						Select type_s
							Case 0: 'insta
								
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
								sql1.ExecNonQuery("UPDATE tbl_coin set cm='"&c_m&"',cf='"&c_f&"' WHERE userid='"&i_pk&"' ")
								
							Case 1: 
								

								Dim c_m As String = colroot.Get("c_m")
								Dim uid As String = colroot.Get("uid")
								Dim first_last As String = colroot.Get("first_last")
								Dim id As String = colroot.Get("id")
								Dim userid As String = colroot.Get("userid")
								Dim username As String = colroot.Get("username")
								Dim c_ch As String = colroot.Get("c_ch")
								Dim n_coins=c_m As Long
								If n_coins>100 Then
									lbl_nums.Text="سکه "&NumberFormat(c_m,3,0)
								Else
									lbl_nums.Text="سکه "&c_m
								End If
				
								sql1.ExecNonQuery("UPDATE tbl_coin set cm='"&c_m&"',cf='"&c_ch&"' WHERE userid='"&userid_t&"' ")
							
								
						End Select
						
					
					Else
						mtoast.Initialize("تعداد سکه های انتخابی بیشتر از موجودی شماست",mtoast.LENGTH_LONG,mtoast.TYPE_WARNING)
						
					
					End If
					
					Else
						mtoast.Initialize("کاربر مورد نظر یافت نشد!",mtoast.LENGTH_SHORT,mtoast.TYPE_INFO)
				End If
				

				
			Next
			
	End Select
End Sub

Sub meno_Click
	mimeno.Initialize("mimeno",Me)
	mimeno.addpnl
	mimeno.open
End Sub