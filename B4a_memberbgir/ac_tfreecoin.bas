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
	Dim type_done As Int
	
End Sub

Sub Globals
	Dim meno As Label
	Dim pnl_coins As Panel
	Dim lbl_icon ,lbl_nums As Label
	Dim roundview As MC7RoundView
	Dim LV As Hitex_LayoutView
	Dim glide As Hitex_Glide
	Dim i_username ,i_pk,i_cookie,i_pic As String
	Private list_like(20),list_com(20),list_follow(20) As List
	Private nll=0,ncc=0,nff=0 As Int
	Dim cm As String
	Dim img_target As Hitex_ImageView
	Private posi As Int
	Dim username_t ,userid_t As String
	Dim mimeno As mi_meno
	Dim telegs As milad_telegramv3
	
	Dim WebView1 As WebView
	Dim WebViewExtras1 As WebViewExtras
End Sub

Sub Activity_Create(FirstTime As Boolean)
'	mimeno.Initialize("mimeno",Me)
'	mimeno.addpnl

	telegs.Initialize("telegs")
	
	For ig=0 To 17
		list_com(ig).Initialize
		list_like(ig).Initialize
		list_follow(ig).Initialize
		
	Next
	''''''''''''''''''''''''''''''''''''''''db
	If File.Exists(File.DirInternal,"instadb.db")=False Then
		File.Copy(File.DirAssets,"instadb.db",File.DirInternal,"instadb.db")
	End If
	If sql1.IsInitialized=False Then
		sql1.Initialize(File.DirInternal,"instadb.db",False)
	
	End If
	''''''''''''''''''''''''''''''''''''''''
	cursor1 = sql1.ExecQuery("SELECT * FROM tbl_tele WHERE soich='1'")
	Dim i As Int
	For i=0 To cursor1.RowCount-1
		cursor1.Position=i
		userid_t=cursor1.GetString("userid")
		username_t=cursor1.GetString("username")
	Next
	cursor1.Close
	
	
	Dim Gradient1 As GradientDrawable
	Dim Clrs(5) As Int
	Clrs(0) = 0xFFe8eaf6
	Clrs(1) = 0xFFe8eaf6
	Clrs(2) = 0xFFe8eaf6
	Clrs(3) = 0xFF283593
	Clrs(4) = 0xFF283593
	
	Gradient1.Initialize("TOP_BOTTOM", Clrs)
	Activity.Background=Gradient1
	
	Dim bkcolor As ColorDrawable
	bkcolor.Initialize(Colors.White,8)
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
	roundview.CornerRadius_BL=35
	roundview.CornerRadius_TL=35
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
	
	Dim pnl_main As Panel
	pnl_main.Initialize("pnl_main")
	Dim bg As ColorDrawable
	bg.Initialize2(Colors.White,10dip,2dip,Colors.LightGray)
	pnl_main.Background=bg
	Activity.AddView(pnl_main,5%x,18%x,90%x,100%y-23%x)
	
	WebView1.Initialize("WebView1")
	WebView1.Color=Colors.White
	Activity.AddView(WebView1, 0, 0,0, 1dip)
	
	
	Select type_done
		
		Case 1:
			like_onCreateViewHolder(pnl_main)
			req_getlike("2","getl")
			posi=0
		Case 0:
			follow_onCreateViewHolder(pnl_main)
			req_getlike("1","getf")
			posi=2

	End Select
	
	req_getme("")
End Sub

Sub Activity_Resume
	req_getme("")

End Sub

Sub Activity_Pause (UserClosed As Boolean)

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
	post.addParametrs("userid",userid_t)

	post.addParametrs("req","get_acct")
	

	post.executRequestAsString
End Sub

Sub prfn_onPostStringErrorListener(Error As ResponseError , Tag As String)
'	Log(Error.ErrorBody)
	ProgressDialogHide
End Sub

Sub prfn_onPostStringOkListener(Result As String  , Tag As String)
	LogColor(Result,Colors.Blue)
	ProgressDialogHide
	Select Tag
		Case "iuser":
			ProgressDialogHide
			Log(Result)
			
		Case "getinsta":
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
			''			lbl_fcoin.Text=c_f
'			lbl_fcoin.Text="salam"



		Case "getl":
			Log(Result)
			Dim parser As JSONParser
			parser.Initialize(Result)
			Dim root As List = parser.NextArray
			For Each colroot As Map In root
				Dim uid As String = colroot.Get("uid")
				Dim msg_idx As String = colroot.Get("msg_id")
				Dim types As String = colroot.Get("types")
				Dim start As String = colroot.Get("start")
				Dim finish As String = colroot.Get("finish")
				Dim id As String = colroot.Get("id")
				Dim userid As String = colroot.Get("userid")
				Dim picx As String = colroot.Get("pic")
				Dim chat_idx As String = colroot.Get("chat_id")
				Dim status As String = colroot.Get("status")
				Dim token As String = colroot.Get("token")
				Dim njob As String = colroot.Get("njob")
				list_like(0).Add(uid)
				list_like(1).Add(types)
				list_like(2).Add(start)
				list_like(3).Add(finish)
				list_like(4).Add(id)
				list_like(5).Add(userid)
				list_like(6).Add(chat_idx)
				list_like(7).Add(status)
				list_like(8).Add(token)
				list_like(9).Add(picx)
				list_like(10).Add(msg_idx)
				list_like(11).Add(njob)
				
			Next
			
			
				
			nll=list_like(4).Size
			
			If list_like(4).Size>0 Then
				setviewsa(0)
				
			End If
			
		Case "getc":
			
			Dim parser As JSONParser
			parser.Initialize(Result)
			Dim root As List = parser.NextArray
			For Each colroot As Map In root
				Dim uid As String = colroot.Get("uid")
				Dim codes As String = colroot.Get("codes")
				Dim types As String = colroot.Get("types")
				Dim comtext As String = colroot.Get("comtext")
				Dim start As String = colroot.Get("start")
				Dim finish As String = colroot.Get("finish")
				Dim id As String = colroot.Get("id")
				Dim userid As String = colroot.Get("userid")
				Dim imgpost As String = colroot.Get("imgpost")
				Dim target As String = colroot.Get("target")
				Dim status As String = colroot.Get("status")
				Dim token As String = colroot.Get("token")
				
				list_com(0).Add(uid)
				list_com(1).Add(types)
				list_com(2).Add(start)
				list_com(3).Add(finish)
				list_com(4).Add(id)
				list_com(5).Add(userid)
				list_com(6).Add(target)
				list_com(7).Add(status)
				list_com(8).Add(token)
				list_com(9).Add(comtext)
				list_com(10).Add(imgpost)
				
				
			Next

			
			
			Log(comtext)
				
			ncc=list_com(4).Size
			
			setviewsa(1)
			
		Case "getf":
			Dim parser As JSONParser
			parser.Initialize(Result)
			Dim root As List = parser.NextArray
			For Each colroot As Map In root
				Dim uid As String = colroot.Get("uid")
				Dim msg_idx As String = colroot.Get("msg_id")
				Dim types As String = colroot.Get("types")
				Dim start As String = colroot.Get("start")
				Dim finish As String = colroot.Get("finish")
				Dim id As String = colroot.Get("id")
				Dim userid As String = colroot.Get("userid")
				Dim picx As String = colroot.Get("pic")
				Dim chat_idx As String = colroot.Get("chat_id")
				Dim status As String = colroot.Get("status")
				Dim token As String = colroot.Get("token")
				Log("pic : "&picx)
				list_follow(0).Add(uid)
				list_follow(1).Add(types)
				list_follow(2).Add(start)
				list_follow(3).Add(finish)
				list_follow(4).Add(id)
				list_follow(5).Add(userid)
				list_follow(6).Add(chat_idx)
				list_follow(7).Add(status)
				list_follow(8).Add(token)
				list_follow(9).Add(picx)
				list_follow(10).Add(msg_idx)
			Next
			nff=list_follow(4).Size
			If list_follow(4).Size>0 Then
				setviewsa(2)
				
			End If
		  
		Case "donereq":
			
			If Result.Contains("error_code")=True Then
				Select type_done
					Case 1:
						ToastMessageShow("از قبل بازدید شده",False)
						getnex(0)
						
					Case 2:
						ToastMessageShow("از قبل جوین شده",False)
						getnex(2)
							
					Case 0:
						ToastMessageShow("از قبل جوین شده",False)
						getnex(2)
							
				End Select
			Else
				Dim parser As JSONParser
				parser.Initialize(Result)
				Dim root As List = parser.NextArray
				For Each colroot As Map In root
					Dim Result As String = colroot.Get("result")
					Dim c_m As String = colroot.Get("c_m")
					Dim uid As String = colroot.Get("uid")
					Dim id As String = colroot.Get("id")
'					Dim c_f As String = colroot.Get("c_f")
'					Dim pic As String = colroot.Get("pic")
					Dim userid As String = colroot.Get("userid")
					Dim username As String = colroot.Get("username")
'					Log(c_f)
				
					sql1.ExecNonQuery("UPDATE tbl_coin set cm='"&c_m&"',cf='0' WHERE userid='"&userid_t&"' ")
				
				Next
'				getcoin(posi)
				Dim n_coins=c_m As Long
				If n_coins>100 Then
					lbl_nums.Text="سکه "&NumberFormat(n_coins,3,0)
				Else
					lbl_nums.Text="سکه "&n_coins
				End If
				
				Select type_done
	 	
					Case 1:   ''' view post
						getnex(nll)
						
					Case 0:
						getnex(nff)
							
				End Select
				
				
			End If
		
	End Select
End Sub


Sub like_onCreateViewHolder (Parent As Panel)
	
	Dim pnl_prof As Panel
	pnl_prof.Initialize("pnl_prof")
	Dim bg As ColorDrawable
	bg.Initialize2(Colors.White,10dip,2dip,Colors.LightGray)
	pnl_prof.Background=bg
	Parent.AddView(pnl_prof,Parent.Width/2-20%x,5%x,40%x,40%x)
	
	img_target.Initialize("img_target")
	img_target.Gravity=Gravity.FILL
	pnl_prof.AddView(img_target,0,0,pnl_prof.Width,pnl_prof.Height)
	
	Dim pnl_caption As Panel
	pnl_caption.Initialize("pnl_caption")
	Dim bg As ColorDrawable
	bg.Initialize2(Colors.White,10dip,2dip,Colors.LightGray)
	pnl_caption.Background=bg
	pnl_caption.Visible=False
	Parent.AddView(pnl_caption,5%x,pnl_prof.Top+pnl_prof.Height+5%x,Parent.Width-10%x,17%x)
	
	Dim lbl_caption As Label
	lbl_caption.Initialize("lbl_caption")
	lbl_caption.TextColor=Colors.DarkGray
	lbl_caption.TextSize=14
	lbl_caption.Typeface=Typeface.LoadFromAssets("iran_sans.ttf")
	lbl_caption.Text="کپشن پست در این قسمت"
	lbl_caption.Visible=False
	lbl_caption.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	pnl_caption.AddView(lbl_caption,0,0,pnl_caption.Width,pnl_caption.Height)
	
	Dim pnl_autolike As Panel
	pnl_autolike.Initialize("pnl_autolike")
	Dim bg As ColorDrawable
	bg.Initialize2(Colors.White,10dip,2dip,Colors.LightGray)
	pnl_autolike.Background=bg
	Parent.AddView(pnl_autolike,5%x,pnl_caption.Top+pnl_caption.Height+5%x,Parent.Width-10%x,25%x)
	
	Dim ch_like As ACCheckBox
	ch_like.Initialize("ch_like")
	ch_like.Text="بازدید خودکار"
	ch_like.Typeface=Typeface.LoadFromAssets("iran_sans.ttf")
	ch_like.TextSize=14
	pnl_autolike.AddView(ch_like,5%x,5%x,pnl_autolike.Width-10%x,7%x)
	
	Dim lbl_notis As Label
	lbl_notis.Initialize("lbl_notis")
	lbl_notis.TextColor=Colors.DarkGray
	lbl_notis.TextSize=11
	lbl_notis.Typeface=Typeface.LoadFromAssets("iran_sans.ttf")
	lbl_notis.Text="نکته با فعال سازی این گزینه بصورت خودکار تمامی پست ها بازدید میشوند"
	lbl_notis.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	pnl_autolike.AddView(lbl_notis,0,5%x,pnl_autolike.Width,pnl_autolike.Height)
	
	Dim bg As ColorDrawable
	bg.Initialize2(0xFF9D00FF,10dip,2dip,Colors.LightGray)
	
	Dim lbl_req As Label
	lbl_req.Initialize("lbl_req")
	lbl_req.TextColor=Colors.White
	lbl_req.TextSize=17
	lbl_req.Typeface=Typeface.LoadFromAssets("iran_sans.ttf")
	lbl_req.Text="بازدید"
	lbl_req.Background=bg
	lbl_req.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	Parent.AddView(lbl_req,5%x,pnl_autolike.Top+pnl_autolike.Height+5%x,Parent.Width-10%x,12%x)
	
	Dim lbl_reqs As Label
	lbl_reqs.Initialize("lbl_req")
	lbl_reqs.TextColor=Colors.White
	lbl_reqs.TextSize=30
	lbl_reqs.Typeface=Typeface.MATERIALICONS
	lbl_reqs.Text=Chr(0xE417)
	lbl_reqs.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	Parent.AddView(lbl_reqs,15%x,pnl_autolike.Top+pnl_autolike.Height+5%x,10%x,12%x)
	
	Dim bg As ColorDrawable
	bg.Initialize2(0xFF454149,10dip,2dip,Colors.LightGray)
	
	Dim lbl_next As Label
	lbl_next.Initialize("lbl_next")
	lbl_next.TextColor=Colors.White
	lbl_next.TextSize=17
	lbl_next.Typeface=Typeface.LoadFromAssets("iran_sans.ttf")
	lbl_next.Text="بعدی"
	lbl_next.Background=bg
	lbl_next.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	Parent.AddView(lbl_next,5%x,lbl_req.Top+lbl_req.Height+5%x,Parent.Width-10%x,12%x)
	
	Dim lbl_nexi As Label
	lbl_nexi.Initialize("lbl_next")
	lbl_nexi.TextColor=Colors.LightGray
	lbl_nexi.TextSize=30
	lbl_nexi.Typeface=Typeface.MATERIALICONS
	lbl_nexi.Text=Chr(0xE15F)
	lbl_nexi.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	Parent.AddView(lbl_nexi,15%x,lbl_req.Top+lbl_req.Height+5%x,10%x,12%x)
End Sub

Sub comment_onCreateViewHolder (Parent As Panel)
	
	Dim pnl_prof As Panel
	pnl_prof.Initialize("pnl_prof")
	Dim bg As ColorDrawable
	bg.Initialize2(Colors.White,10dip,2dip,Colors.LightGray)
	pnl_prof.Background=bg
	Parent.AddView(pnl_prof,Parent.Width/2-20%x,5%x,40%x,40%x)
	
	img_target.Initialize("img_target")
	img_target.Gravity=Gravity.FILL
	pnl_prof.AddView(img_target,0,0,pnl_prof.Width,pnl_prof.Height)
	
	Dim pnl_caption As Panel
	pnl_caption.Initialize("pnl_caption")
	Dim bg As ColorDrawable
	bg.Initialize2(Colors.White,10dip,2dip,Colors.LightGray)
	pnl_caption.Background=bg
	Parent.AddView(pnl_caption,5%x,pnl_prof.Top+pnl_prof.Height+5%x,Parent.Width-10%x,17%x)
	
	Dim lbl_caption As Label
	lbl_caption.Initialize("lbl_caption")
	lbl_caption.Visible=False
	lbl_caption.TextColor=Colors.DarkGray
	lbl_caption.TextSize=14
	lbl_caption.Typeface=Typeface.LoadFromAssets("iran_sans.ttf")
	lbl_caption.Text="کپشن پست در این قسمت"
	lbl_caption.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	pnl_caption.AddView(lbl_caption,0,0,pnl_caption.Width,pnl_caption.Height)
	
	Dim pnl_autolike As Panel
	pnl_autolike.Initialize("pnl_autolike")
	Dim bg As ColorDrawable
	bg.Initialize2(Colors.White,10dip,2dip,Colors.LightGray)
	pnl_autolike.Background=bg
	Parent.AddView(pnl_autolike,5%x,pnl_caption.Top+pnl_caption.Height+5%x,Parent.Width-10%x,25%x)
	
	Dim ch_like As ACCheckBox
	ch_like.Initialize("ch_like")
	ch_like.Text="کامنت خودکار"
	ch_like.Typeface=Typeface.LoadFromAssets("iran_sans.ttf")
	ch_like.TextSize=14
	pnl_autolike.AddView(ch_like,5%x,5%x,pnl_autolike.Width-10%x,7%x)
	
	Dim lbl_notis As Label
	lbl_notis.Initialize("lbl_notis")
	lbl_notis.TextColor=Colors.DarkGray
	lbl_notis.TextSize=11
	lbl_notis.Typeface=Typeface.LoadFromAssets("iran_sans.ttf")
	lbl_notis.Text="نکته با فعال سازی این گزینه بصورت خودکار تمامی پست ها کامنت میشوند"
	lbl_notis.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	pnl_autolike.AddView(lbl_notis,0,5%x,pnl_autolike.Width,pnl_autolike.Height)
	
	Dim bg As ColorDrawable
	bg.Initialize2(0xFF9D00FF,10dip,2dip,Colors.LightGray)
	
	Dim lbl_req As Label
	lbl_req.Initialize("lbl_req")
	lbl_req.TextColor=Colors.White
	lbl_req.TextSize=17
	lbl_req.Typeface=Typeface.LoadFromAssets("iran_sans.ttf")
	lbl_req.Text="کامنت بزار"
	lbl_req.Background=bg
	lbl_req.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	Parent.AddView(lbl_req,5%x,pnl_autolike.Top+pnl_autolike.Height+5%x,Parent.Width-10%x,12%x)
	
	Dim lbl_reqs As Label
	lbl_reqs.Initialize("lbl_req")
	lbl_reqs.TextColor=Colors.White
	lbl_reqs.TextSize=30
	lbl_reqs.Typeface=Typeface.MATERIALICONS
	lbl_reqs.Text=Chr(0xE7FE)
	lbl_reqs.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	Parent.AddView(lbl_reqs,15%x,pnl_autolike.Top+pnl_autolike.Height+5%x,10%x,12%x)
	
	Dim bg As ColorDrawable
	bg.Initialize2(0xFF454149,10dip,2dip,Colors.LightGray)
	
	Dim lbl_next As Label
	lbl_next.Initialize("lbl_next")
	lbl_next.TextColor=Colors.White
	lbl_next.TextSize=17
	lbl_next.Typeface=Typeface.LoadFromAssets("iran_sans.ttf")
	lbl_next.Text="بعدی"
	lbl_next.Background=bg
	lbl_next.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	Parent.AddView(lbl_next,5%x,lbl_req.Top+lbl_req.Height+5%x,Parent.Width-10%x,12%x)
	
	Dim lbl_nexi As Label
	lbl_nexi.Initialize("lbl_next")
	lbl_nexi.TextColor=Colors.LightGray
	lbl_nexi.TextSize=30
	lbl_nexi.Typeface=Typeface.MATERIALICONS
	lbl_nexi.Text=Chr(0xE15F)
	lbl_nexi.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	Parent.AddView(lbl_nexi,15%x,lbl_req.Top+lbl_req.Height+5%x,10%x,12%x)
End Sub

Sub follow_onCreateViewHolder (Parent As Panel)
	
	Dim pnl_prof As Panel
	pnl_prof.Initialize("pnl_prof")
	Dim bg As ColorDrawable
	bg.Initialize2(Colors.White,10dip,2dip,Colors.LightGray)
	pnl_prof.Background=bg
	Parent.AddView(pnl_prof,Parent.Width/2-20%x,5%x,40%x,40%x)
	
	img_target.Initialize("img_target")
	img_target.Gravity=Gravity.FILL
	pnl_prof.AddView(img_target,0,0,pnl_prof.Width,pnl_prof.Height)
	
	Dim pnl_caption As Panel
	pnl_caption.Initialize("pnl_caption")
	Dim bg As ColorDrawable
	bg.Initialize2(Colors.White,10dip,2dip,Colors.LightGray)
	pnl_caption.Background=bg
	pnl_caption.Visible=False
	Parent.AddView(pnl_caption,5%x,pnl_prof.Top+pnl_prof.Height+5%x,Parent.Width-10%x,17%x)
	
	Dim lbl_caption As Label
	lbl_caption.Initialize("lbl_caption")
	lbl_caption.Visible=False
	lbl_caption.TextColor=Colors.DarkGray
	lbl_caption.TextSize=14
	lbl_caption.Typeface=Typeface.LoadFromAssets("iran_sans.ttf")
	lbl_caption.Text="کپشن پست در این قسمت"
	lbl_caption.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	pnl_caption.AddView(lbl_caption,0,0,pnl_caption.Width,pnl_caption.Height)
	
	Dim pnl_autolike As Panel
	pnl_autolike.Initialize("pnl_autolike")
	Dim bg As ColorDrawable
	bg.Initialize2(Colors.White,10dip,2dip,Colors.LightGray)
	pnl_autolike.Background=bg
	Parent.AddView(pnl_autolike,5%x,pnl_caption.Top+pnl_caption.Height+5%x,Parent.Width-10%x,25%x)
	
	Dim ch_like As ACCheckBox
	ch_like.Initialize("ch_like")
	ch_like.Text="جوین خودکار"
	ch_like.Typeface=Typeface.LoadFromAssets("iran_sans.ttf")
	ch_like.TextSize=14
	pnl_autolike.AddView(ch_like,5%x,5%x,pnl_autolike.Width-10%x,7%x)
	
	Dim lbl_notis As Label
	lbl_notis.Initialize("lbl_notis")
	lbl_notis.TextColor=Colors.DarkGray
	lbl_notis.TextSize=11
	lbl_notis.Typeface=Typeface.LoadFromAssets("iran_sans.ttf")
	lbl_notis.Text="نکته با فعال سازی این گزینه بصورت خودکار وارد کانال میشوید"
	lbl_notis.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	pnl_autolike.AddView(lbl_notis,0,5%x,pnl_autolike.Width,pnl_autolike.Height)
	
	Dim bg As ColorDrawable
	bg.Initialize2(0xFF9D00FF,10dip,2dip,Colors.LightGray)
	
	Dim lbl_req As Label
	lbl_req.Initialize("lbl_req")
	lbl_req.TextColor=Colors.White
	lbl_req.TextSize=17
	lbl_req.Typeface=Typeface.LoadFromAssets("iran_sans.ttf")
	lbl_req.Text="جوین"
	lbl_req.Background=bg
	lbl_req.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	Parent.AddView(lbl_req,5%x,pnl_autolike.Top+pnl_autolike.Height+5%x,Parent.Width-10%x,12%x)
	
	Dim lbl_reqs As Label
	lbl_reqs.Initialize("lbl_req")
	lbl_reqs.TextColor=Colors.White
	lbl_reqs.TextSize=30
	lbl_reqs.Typeface=Typeface.MATERIALICONS
	lbl_reqs.Text=Chr(0xE7FE)
	lbl_reqs.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	Parent.AddView(lbl_reqs,15%x,pnl_autolike.Top+pnl_autolike.Height+5%x,10%x,12%x)
	
	Dim bg As ColorDrawable
	bg.Initialize2(0xFF454149,10dip,2dip,Colors.LightGray)
	
	Dim lbl_next As Label
	lbl_next.Initialize("lbl_next")
	lbl_next.TextColor=Colors.White
	lbl_next.TextSize=17
	lbl_next.Typeface=Typeface.LoadFromAssets("iran_sans.ttf")
	lbl_next.Text="بعدی"
	lbl_next.Background=bg
	lbl_next.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	Parent.AddView(lbl_next,5%x,lbl_req.Top+lbl_req.Height+5%x,Parent.Width-10%x,12%x)
	
	Dim lbl_nexi As Label
	lbl_nexi.Initialize("lbl_next")
	lbl_nexi.TextColor=Colors.LightGray
	lbl_nexi.TextSize=30
	lbl_nexi.Typeface=Typeface.MATERIALICONS
	lbl_nexi.Text=Chr(0xE15F)
	lbl_nexi.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	Parent.AddView(lbl_nexi,15%x,lbl_req.Top+lbl_req.Height+5%x,10%x,12%x)
End Sub

Sub like_onBindViewHolder (Parent As Panel, Position As Int)
	
End Sub

Sub lbl_req_Click
	Select type_done
	 	
		Case 1:   ''' view post
			
			If nll=0 Then
				Log("get new list")
				req_getlike("2","getl")
				
			Else
				posi=0
				ProgressDialogShow("در حال بازدید...")
				
				Log("chat id "&list_like(6).Get(nll))
				Log("msg id "&list_like(10).Get(nll))
				Log("user "&list_like(11).Get(nll))
				Dim ln_chatid,ln_msgid As Long
				ln_chatid=list_like(6).Get(nll)
				ln_msgid=list_like(10).Get(nll)
				
				
				Dim JavascriptInterface1 As DefaultJavascriptInterface
				JavascriptInterface1.Initialize
				WebViewExtras1.Initialize(WebView1)
				WebViewExtras1.addJavascriptInterface(JavascriptInterface1, "B4A")
				ln_msgid=ln_msgid/1048576
				Dim urls As String
				urls="https://t.me/"&list_like(11).Get(nll)&"/"&ln_msgid
				Log(urls)
				
				WebViewExtras1.LoadUrl(urls)
				Wait For WebView1_PageFinished (url As String)
				If url=urls Then
					Log(url)
					setreq(userid_t,list_like(8).Get(nll),1)

					ProgressDialogHide
				Else
					getnex(posi)
					ProgressDialogHide
				
				End If
				
				
'				telegs.searchPublicChat(list_like(11).Get(nll))
'				Sleep(500)
'				telegs.Viewmsg(list_like(6).Get(nll),Array As Long(list_like(10).Get(nll)))
				''
'				Wait For telegs_viewdon(value As String)
'				If value="ok" Then
'					setreq(userid_t,list_like(8).Get(nll),1)
'					
'				Else
'					getnex(posi)
'						
'				End If
				
				
'				Dim telegs As milad_telegramv3
'				telegs.Initialize("telegs")
'				telegs.Getingmsg(ln_chatid,Array As Long(ln_msgid),0,1,list_like(11).Get(nll))
'				
				''				telegs.Viewmsg(list_like(6).Get(nll),Array As Long(list_like(10).Get(nll)))
'				Wait For telegs_chatgroup(value As String)
'				LogColor(value,Colors.red)
'				Dim parser As JSONParser
'				parser.Initialize(value)
'				Dim root As List = parser.NextArray
'				For Each colroot As Map In root
'					Dim meg_replyToMessageId As Int = colroot.Get("meg_replyToMessageId")
'					Dim meg_chatId As Long = colroot.Get("meg_chatId")
'					Dim meg_senderUserId As Int = colroot.Get("meg_senderUserId")
'					Dim meg_editDate As Int = colroot.Get("meg_editDate")
'					Dim meg_isPost As String = colroot.Get("meg_isPost")
'					Dim meg_id As Long = colroot.Get("meg_id")
				''			Log(meg_id)
'					Dim meg_views As Int = colroot.Get("meg_views")
'					Dim msg_type As String = colroot.Get("msg_type")
'					Dim meg_canBeDeleted As String = colroot.Get("meg_canBeDeleted")
'					Dim massege_info As String = colroot.Get("massege_info")
'					Dim meg_viaBotUserId As Int = colroot.Get("meg_viaBotUserId")
'					Dim meg_date As Int = colroot.Get("meg_date")
'					Dim meg_canBeEdited As String = colroot.Get("meg_canBeEdited")
'					Dim ReplyMarkup As String = colroot.Get("ReplyMarkup")
'					Log("ReplyMarkup: "&ReplyMarkup)
'					LogColor(meg_id,Colors.Blue)
'					telegs.Viewmsg(meg_chatId,Array As Long(meg_id))
'				Next
'				getnex(0)
				
'				Wait For telegs_viewdon(value As String)
'				LogColor("view : "&value,Colors.Blue)
'				If value="ok" Then
'					
'					setreq(userid_t,list_like(8).Get(nll),1)
'					
'					Else
'					getnex(posi)
'					
'				End If
		
				
			End If
			
			
		Case 2:
			If ncc=0 Then
				Log("get new list")
				req_getlike("2","getc")
				
				
			Else
				
				
				
				
			End If
			
		Case 0:  'join
			posi=2
			If nff=1 Then
				Log("get new list")
				req_getlike("1","getf")
				
			Else
				ProgressDialogShow("در حال جوین...")
				
'				Dim telegs As milad_telegramv3
'				telegs.Initialize("telegs")
				telegs.Joinchannel(list_follow(6).Get(nff),userid_t)
				Wait For telegs_joinchannel(value As String)
				LogColor("view : "&value,Colors.Red)
				If value="ok" Then
					
					setreq(userid_t,list_follow(8).Get(nff),1)
					
				Else
					
					getnex(2)
					
				End If
				
'				instaa.user_follow(list_follow(6).Get(nff),i_pk,i_cookie)
'				Wait For instaa_user_FollowDone(response As String,job As Boolean)
'				ProgressDialogHide
'				If job=True Then
'					Log(response)
'					Try
'						setreq(i_pk,list_follow(6).Get(nff),3)
'						
'					Catch
'						Log(LastException)
'					End Try
				''					setreq(i_pk,list_like(6).Get(nff),3)
'				Else
'					getnex(posi)
'						
'					Log(response)
'				End If
				
				
				
			End If
		
		
		
	End Select
End Sub

Sub lbl_next_Click
	Select type_done
		
		Case 1:
			If nll=1 Then
				Log("get new list")
				req_getlike("2","getl")
				
			Else
				getnex(0)
				
			End If
		
		Case 0:
			If nff=1 Then
				Log("get new list")
				req_getlike("1","getf")
				
			Else
				getnex(2)
				
			End If
		
		
	End Select
End Sub

Sub ch_like_CheckedChange(Checked As Boolean)
     
	Log("check ! "&Checked)
'	Dim chek As Boolean
'	chek=Checked
'	If chek=False Then
'		Return
'	End If
'	For i=0 To 10
'		
'		Select chek
'			Case True:
'				If chek=True Then
'					Log("is true"&i)
'					Else
'					Log("is false"&i)
'					ch_like_CheckedChange(False)
'					Return
'					
'				End If
	'
'				Sleep(3000)
'			Case False:
'				
'		End Select
'		
'	Next
	 
	auto_done(Checked)
  
'	If Checked=True Then
'		Select type_done
'			Case 1:
'				ProgressDialogShow2("درحال بازدید خودکار",False)
'				For i=0 To nll
	''					btn_l_Click
'					lbl_req_Click
'					Sleep(4000)
'					Log("for : "&i)
	''					btn_l_Click
'					ch_like_CheckedChange(True)
	'                    lbl_req_Click
'					If i=nll Then
'						ProgressDialogHide
'					End If
'					If isruned=False Then
'						Return
'					End If
'				Next
'			Case 2:
'				ProgressDialogShow2("درحال کامنت خودکار",False)
'			
'				For i=0 To ncc
	''				btn_l_Click
'					lbl_req_Click
'					Sleep(4000)
'					Log("for : "&i)
'					ch_like_CheckedChange(True)
'					lbl_req_Click
'					If i=ncc Then
'						ProgressDialogHide
'					End If
'					If isruned=False Then
'						Return
'					End If
'				Next
'			
'			Case 0:
'				Log(nff)
'				ProgressDialogShow2("درحال جوین خودکار",False)
'			
'				For i=0 To nff
	''				btn_l_Click
'					lbl_req_Click
'					Sleep(4000)
'					Log("for : "&i)
'					ch_like_CheckedChange(True)
'					lbl_req_Click
'					If i=nff Then
'						ProgressDialogHide
'					End If
'					If isruned=False Then
'						Return
'					End If
'				Next
'		End Select
'	End If
	
	
End Sub

Sub auto_done(runing As Boolean)
	Do While (runing)
		
		
		Select type_done
			Case 1:
				ProgressDialogShow2("درحال بازدید خودکار",False)

				lbl_req_Click
				Sleep(4000)

			
			Case 0:
				Log(nff)
				ProgressDialogShow2("درحال جوین خودکار",False)
						
				lbl_req_Click
				Sleep(4000)
						
		End Select
	
		
		
	Loop
End Sub

Sub setreq(userid As String,mediaid As String,typemodule As String)
'	Dim fm As FirebaseMessaging
'	fm.Initialize("fm")
'	Log(fm.Token)

	Dim prfn As PersianFastNetwork
	prfn.initialize("prfn")
	Dim post As PostRequest
	post=prfn.BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/req.php","donereq")
	
	post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")
	post.addParametrs("req","donereqt")
	post.addParametrs("userid",userid)
	post.addParametrs("mediaid",mediaid)
	post.addParametrs("typemodule","1")

	post.executRequestAsString
	
	ProgressDialogShow("در حال پردازش...")
	
	
End Sub

Sub req_getlike(types As String,tagreq As String)
	Log("get")
	Dim prfn As PersianFastNetwork
	
	prfn.initialize("prfn")
  
	Dim post As PostRequest
	post=prfn.BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/req.php",tagreq)
	
	post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")

	post.addParametrs("types",types)
'	post.addParametrs("userid","123456")

	post.addParametrs("req","get_telegram")

	

	post.executRequestAsString
	ProgressDialogShow2("در حال دریافت لیست...",True)
End Sub

Sub setviewsa(posisa As Int)
	Try
		cursor1 = sql1.ExecQuery("SELECT * FROM tbl_coin WHERE userid='"&userid_t&"' ")
		Dim i As Int
		For i=0 To cursor1.RowCount-1
			cursor1.Position=i
			cm=cursor1.GetString("cm")
'		cf=cursor1.GetString("cf")
		Next
	
	
		Select type_done
			Case 1:  '''''''''''''''''''''' view
				nll=nll-1
			
				glide.Load2(list_like(9).Get(nll)).OptionalCircleCrop.Into(img_target)
			

				Dim n_coins=cm As Long
				If n_coins>100 Then
					lbl_nums.Text="سکه "&NumberFormat(n_coins,3,0)
				Else
					lbl_nums.Text="سکه "&n_coins
				End If
		
			Case 0: '''''''''''''''''join
				nff=nff-1
				Log("img : "&list_follow(9).Get(nff))
				glide.Load2(list_follow(9).Get(nff)).OptionalCenterCrop.Into(img_target)

			
				Dim n_coins=cm As Long
				If n_coins>100 Then
					lbl_nums.Text="سکه "&NumberFormat(n_coins,3,0)
				Else
					lbl_nums.Text="سکه "&n_coins
				End If
		End Select
	Catch
		Log(LastException)
	End Try
	
	
End Sub

Sub getnex(posis As Int)
	Try
		cursor1 = sql1.ExecQuery("SELECT * FROM tbl_coin WHERE userid='"&userid_t&"' ")
		Dim i As Int
		For i=0 To cursor1.RowCount-1
			cursor1.Position=i
			cm=cursor1.GetString("cm")
'		cf=cursor1.GetString("cf")
		Next

		Select type_done
			Case 1:
				nll=nll-1
			
				glide.Load2(list_like(9).Get(nll)).OptionalCircleCrop.Into(img_target)

				Dim n_coins=cm As Long
				If n_coins>100 Then
					lbl_nums.Text="سکه "&NumberFormat(n_coins,3,0)
				Else
					lbl_nums.Text="سکه "&n_coins
				End If
		
			Case 0:
			
				nff=nff-1
			
				glide.Load2(list_follow(9).Get(nff)).OptionalCircleCrop.Into(img_target)

				Dim n_coins=cm As Long
				If n_coins>100 Then
					lbl_nums.Text="سکه "&NumberFormat(n_coins,3,0)
				Else
					lbl_nums.Text="سکه "&n_coins
				End If
		End Select
	Catch
		Log(LastException)
	End Try
'	Sleep(300)
	
	
End Sub

Sub telegs_errormsg(value As String)
	LogColor(value,Colors.Blue)
	Dim parser As JSONParser
	parser.Initialize(value)
	Dim root As Map = parser.NextObject
	Dim Error_msg As String = root.Get("Error_msg")
	Dim ErrorConstructor As Int = root.Get("ErrorConstructor")
	Dim Error_code As Int = root.Get("Error_code")
'	ToastMessageShow(Error_msg,False)
	Dim mt As KJ_MaterialToast
	mt.Initialize("خطا : "&Error_msg,mt.LENGTH_LONG,mt.TYPE_INFO)
	
End Sub

Sub telegs_viewdon(value As String)
	LogColor("view : "&value,Colors.Blue)
End Sub

Sub meno_Click
	mimeno.Initialize("mimeno",Me)
	mimeno.addpnl
	mimeno.open
End Sub

Sub telegs_chatgroup(stt As String)
	Log(stt)
End Sub

Sub telegs_getsmessagess(stt As String)
	
	Log(stt)
End Sub
'Sub telegs_chatgroup(value As String)
'	ProgressDialogHide
'	LogColor(value,Colors.Red)
''	Msgbox(value,"")
'	Dim parser As JSONParser
'	parser.Initialize(value)
'	Dim root As List = parser.NextArray
'	For Each colroot As Map In root
'		Dim meg_replyToMessageId As Int = colroot.Get("meg_replyToMessageId")
'		Dim meg_chatId As Long = colroot.Get("meg_chatId")
'		Dim meg_senderUserId As Int = colroot.Get("meg_senderUserId")
'		Dim meg_editDate As Int = colroot.Get("meg_editDate")
'		Dim meg_isPost As String = colroot.Get("meg_isPost")
'		Dim meg_id As Long = colroot.Get("meg_id")
'		'			Log(meg_id)
'		Dim meg_views As Int = colroot.Get("meg_views")
'		Dim msg_type As String = colroot.Get("msg_type")
'		Dim meg_canBeDeleted As String = colroot.Get("meg_canBeDeleted")
'		Dim massege_info As String = colroot.Get("massege_info")
'		Dim meg_viaBotUserId As Int = colroot.Get("meg_viaBotUserId")
'		Dim meg_date As Int = colroot.Get("meg_date")
'		Dim meg_canBeEdited As String = colroot.Get("meg_canBeEdited")
'		Dim ReplyMarkup As String = colroot.Get("ReplyMarkup")
'		Log("ReplyMarkup: "&ReplyMarkup)
'		LogColor(meg_id,Colors.Blue)
'		telegs.Viewmsg(meg_chatId,Array As Long(meg_id))
'	Next
'End Sub