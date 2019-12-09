B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.3
@EndOfDesignText@
Sub Class_Globals
	Private Ev As String
	Private obj As Object
	Private sql1 As SQL
	Private cursor1 As Cursor
	Private pnl_insta As Panel
	Private i_username ,i_pk,i_cookie,i_pic As String
	Private l_users(40) As List
	
	Private LV As Hitex_LayoutView
	Private RL As Hitex_RefreshLayout
	Private Glide As Hitex_Glide
	Private prfn As PersianFastNetwork
	
	
	Type Data(ip As String,pic As Bitmap)
	
	Private username_t ,userid_t As String
	Dim type_history As Int
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(EventName As String,Module As Object)
	Ev = EventName
	obj = Module

	
	For ia=0 To 38
		
		l_users(ia).Initialize
	
		
	Next
	
	'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''database
	If File.Exists(File.DirInternal,"instadb.db")=False Then
		File.Copy(File.DirAssets,"instadb.db",File.DirInternal,"instadb.db")
	End If
	If sql1.IsInitialized=False Then
		sql1.Initialize(File.DirInternal,"instadb.db",False)
	
	End If
	
	cursor1 = sql1.ExecQuery("SELECT * FROM tbl_acc WHERE soich='1' ")
	Dim i As Int
	For i=0 To cursor1.RowCount-1
		cursor1.Position=i
		i_cookie=cursor1.GetString("cookie")
		i_username=cursor1.GetString("username")
		i_pk=cursor1.GetString("pk")
		i_pic=cursor1.GetString("profile_pic_url")
	Next
	cursor1.Close
	
	cursor1 = sql1.ExecQuery("SELECT * FROM tbl_tele WHERE soich='1'")
	Dim i As Int
	For i=0 To cursor1.RowCount-1
		cursor1.Position=i
		userid_t=cursor1.GetString("userid")
		username_t=cursor1.GetString("username")
	Next
	cursor1.Close
	
	
	

End Sub


Sub addpnl(pnl As Panel) As View
	
'	pnl.Color=0xFF673AB7
	
'	l_users(1).Add("user")
'	l_users(1).Add("user")
'	l_users(1).Add("user")
'	l_users(1).Add("user")
'	
'	l_users(2).Add("+98930***7521")
'	l_users(2).Add("+98930***7521")
'	l_users(2).Add("+98930***7521")
'	l_users(2).Add("+98930***7521")
'	
'	l_users(3).Add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcShzfE-2zcBRShnVrjieUJuyskYRvG5--NCxsaB7wrFYc_g5mEZ")
'	l_users(3).Add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcShzfE-2zcBRShnVrjieUJuyskYRvG5--NCxsaB7wrFYc_g5mEZ")
'	l_users(3).Add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcShzfE-2zcBRShnVrjieUJuyskYRvG5--NCxsaB7wrFYc_g5mEZ")
'	l_users(3).Add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcShzfE-2zcBRShnVrjieUJuyskYRvG5--NCxsaB7wrFYc_g5mEZ")
'	
'	
	LV.Initializer("LV").ListView.RefreshLayout.Build
	pnl.AddView(LV,0,0,pnl.Width,pnl.Height)
	LV.CardView.CardElevation(4dip).Radius(2dip)
	LV.Show
	RL.Initialize(LV, "RL")
	RL.Direction = RL.DIRECTION_TOP
	RL.SchemeColors = Array As Int (Colors.Red, Colors.Black, Colors.Blue)
	
	Select type_history
		Case 0:
			req_getme(i_pk)
			
		Case 1:
			Log("get telegram")
			req_telegetme(userid_t)
				
	End Select
	
	

End Sub

Sub LV_onCreateViewHolder (Parent As Panel, ViewType As Int)      '# onCreate #'
	
	Dim imgtype As Hitex_ImageView : imgtype.Initialize("imgtype")
	Parent.AddView(imgtype,100%x-70dip,20dip,35dip,35dip)
	
	Dim lbltype As Label : lbltype.Initialize("lbltype")
	lbltype.TextColor = Colors.DarkGray : lbltype.TextSize = 14
	lbltype.Gravity=Gravity.RIGHT
	Parent.AddView(lbltype,0,25dip,100%x-80dip,-1)
	
	Dim lbl_username As Label : lbl_username.Initialize("lbl_username")
	lbl_username.TextColor = Colors.DarkGray : lbl_username.TextSize = 11
	Parent.AddView(lbl_username,0,80dip,100%x-80dip,-1)
	
	Dim lbl_ok As Label : lbl_ok.Initialize("lbl_ok")
	lbl_ok.TextColor = Colors.DarkGray : lbl_ok.TextSize = 12
	Parent.AddView(lbl_ok,0,120dip,100%x-80dip,-1)
	
	Dim cd As ColorDrawable
	cd.Initialize2(Colors.White,10,0xFF673AB7,2)
	
	Dim pnlpos As Panel : pnlpos.Initialize("pnlpos")
	pnlpos.Background=cd
	Parent.AddView(pnlpos,20dip,40dip,100dip,100dip)
	
	Dim imgpost As Hitex_ImageView : imgpost.Initialize("imgtype")
	pnlpos.AddView(imgpost,0,0,pnlpos.Width,pnlpos.Height)
End Sub

Sub LV_onBindViewHolder (Parent As Panel, Position As Int)         '* onBind *'
	Dim imguser = Parent.GetView(0) As Hitex_ImageView
	
	Dim lbltype = Parent.GetView(1) As Label
	Dim lbl_username = Parent.GetView(2) As Label
	Dim lbl_ok = Parent.GetView(3) As Label
	Dim pnlpos = Parent.GetView(4) As Panel
	Dim imgpost = pnlpos.GetView(0) As Hitex_ImageView

	Select l_users(1).Get(Position)
		
		Case "1": ' like
			Select type_history
				
				Case 0:
					Glide.Load(File.DirAssets,"c_like.png").OptionalCircleCrop.Into(imguser)
					lbltype.Text = "سفارش لایک"
					lbl_username.Text=l_users(2).Get(Position)&" انجام شده از "&l_users(3).Get(Position)&"سفارش"
					If l_users(7).Get(Position)="0" Then
						lbl_ok.Text="وضعیت : در حال انجام "
		
					Else
						lbl_ok.Text="وضعیت : انجام شده"
			
					End If
			
					'''''''''''''''''''''''''''''''''''''''
					Glide.Load2(l_users(9).Get(Position)).OptionalCircleCrop.Into(imgpost)
				Case 1:
					Glide.Load(File.DirAssets,"c_follow.png").OptionalCircleCrop.Into(imguser)
					lbltype.Text = "سفارش ممبر"
					lbl_username.Text=l_users(2).Get(Position)&" انجام شده از "&l_users(3).Get(Position)&"سفارش"
					If l_users(7).Get(Position)="0" Then
						lbl_ok.Text="وضعیت : در حال انجام "
		
					Else
						lbl_ok.Text="وضعیت : انجام شده"
			
					End If
			
					'''''''''''''''''''''''''''''''''''''''
					Glide.Load2(l_users(9).Get(Position)).OptionalCircleCrop.Into(imgpost)
			End Select
			
			
			Parent.Height=200dip
			
		Case "2":  'comment
			
			Select type_history
				
				Case 0:
					Glide.Load(File.DirAssets,"c_com.png").OptionalCircleCrop.Into(imguser)
					lbltype.Text = "سفارش کامنت"
					lbl_username.Text=l_users(2).Get(Position)&" انجام شده از "&l_users(3).Get(Position)&"سفارش"
					If l_users(7).Get(Position)="0" Then
						lbl_ok.Text="وضعیت : در حال انجام "
		
					Else
						lbl_ok.Text="وضعیت : انجام شده"
			
					End If
					Glide.Load2(l_users(9).Get(Position)).OptionalCircleCrop.Into(imgpost)
				Case 1:
					Glide.Load(File.DirAssets,"view_icon.png").OptionalCircleCrop.Into(imguser)
					lbltype.Text = "سفارش بازدید"
					lbl_username.Text=l_users(2).Get(Position)&" انجام شده از "&l_users(3).Get(Position)&"سفارش"
					If l_users(7).Get(Position)="0" Then
						lbl_ok.Text="وضعیت : در حال انجام "
		
					Else
						lbl_ok.Text="وضعیت : انجام شده"
			
					End If
					Glide.Load2(l_users(9).Get(Position)).OptionalCircleCrop.Into(imgpost)
			End Select
	
			Parent.Height=200dip
		
			
		Case "4":   'view
			
			Glide.Load(File.DirAssets,"view_icon.png").OptionalCircleCrop.Into(imguser)
			lbltype.Text = "سفارش ویو"
			lbl_username.Text=l_users(2).Get(Position)&" انجام شده از "&l_users(3).Get(Position)&"سفارش"
			If l_users(7).Get(Position)="0" Then
				lbl_ok.Text="وضعیت : در حال انجام "
		
			Else
				lbl_ok.Text="وضعیت : انجام شده"
			
			End If
			'''''''''''''''''''''''''''''''''''''''
		
			Glide.Load2(l_users(9).Get(Position)).OptionalCircleCrop.Into(imgpost)
			
				
			Parent.Height=200dip
			
			
		Case "3":    'follow
			Glide.Load(File.DirAssets,"c_follow.png").OptionalCircleCrop.Into(imguser)
			lbltype.Text = "سفارش فالوور"
			lbl_username.Text=l_users(2).Get(Position)&" انجام شده از "&l_users(3).Get(Position)&"سفارش"
			If l_users(7).Get(Position)="0" Then
				lbl_ok.Text="وضعیت : در حال انجام "
		
			Else
				lbl_ok.Text="وضعیت : انجام شده"
			
			End If
			Glide.Load2(l_users(9).Get(Position)).OptionalCircleCrop.Into(imgpost)
		
			Parent.Height=200dip
				
			
		
			
			
		
	End Select
	
	

	
End Sub

Sub LV_GetItemCount As Int 								        '$ ItemCount $'
	Return l_users(1).Size 'ItemList.Size
End Sub
Sub RL_onRefresh (Direction As Int)

	Select (Direction)
		Case RL.DIRECTION_TOP:
			Log("TOP")
			For ia=0 To 38
		
				l_users(ia).Initialize
	
		
			Next
'			req_getme(i_pk)

			Select type_history
				Case 0:
					req_getme(i_pk)
			
				Case 1:
					req_telegetme(userid_t)
				
			End Select

			LV.notifyDataSetChanged
			
		Case RL.DIRECTION_BOTTOM:
			Log("BOTTOM")
	End Select

End Sub

Sub req_telegetme(userid As String)
	prfn.initialize("prfn")
  
	Dim post As PostRequest
	post=prfn.BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/req.php","getseft")
	
	post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")

'	post.addParametrs("types",types)
	post.addParametrs("userid",userid_t)

	post.addParametrs("req","get_telesef")
	
	post.executRequestAsString
	
	ProgressDialogShow("در حال دریافت ...")
End Sub

Sub req_getme(userid As String)
	prfn.initialize("prfn")
  
	Dim post As PostRequest
	post=prfn.BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/req.php","getsef")
	
	post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")

'	post.addParametrs("types",types)
	post.addParametrs("userid",userid)

	post.addParametrs("req","get_sef")
	
	post.executRequestAsString
	
	ProgressDialogShow("در حال دریافت ...")
End Sub

Sub prfn_onPostStringErrorListener(Error As ResponseError , Tag As String)
	Log(Error.ErrorBody)
	ProgressDialogHide
	RL.Refreshing=False
	
End Sub

Sub prfn_onPostStringOkListener(Result As String  , Tag As String)
	Log(Result)
	ProgressDialogHide
	RL.Refreshing=False
	Select Tag
		Case "getseft":
			LogColor("msg :"&Result,Colors.Blue)
			Dim parser As JSONParser
			parser.Initialize(Result)
			Dim root As List = parser.NextArray
			For Each colroot As Map In root
				Dim uid As String = colroot.Get("uid")
				Dim types As String = colroot.Get("types")
				Dim start As String = colroot.Get("start")
				Dim finish As String = colroot.Get("finish")
				Dim id As String = colroot.Get("id")
				Dim pic As String = colroot.Get("pic")
				Dim msg_id As String = colroot.Get("msg_id")
				Dim njob As String = colroot.Get("njob")
				Dim userid As String = colroot.Get("userid")
				Dim chat_id As String = colroot.Get("chat_id")
				Dim status As String = colroot.Get("status")
				Dim token As String = colroot.Get("token")
				
				l_users(0).Add(uid)
				l_users(1).Add(types)
				l_users(2).Add(start)
				l_users(3).Add(finish)
				l_users(4).Add(id)
				l_users(5).Add(userid)
				l_users(6).Add(chat_id)
				l_users(7).Add(status)
				l_users(8).Add(token)
				l_users(9).Add(pic)
					
			Next
				
			LV.notifyDataSetChanged
		

		Case "getsef":
		
			If Result.Length>20 Then
				
				Dim parser As JSONParser
				parser.Initialize(Result)
				Dim root As List = parser.NextArray
				For Each colroot As Map In root
					Dim uid As String = colroot.Get("uid")
					Dim codes As String = colroot.Get("codes")
					Dim types As String = colroot.Get("types")
					Dim start As String = colroot.Get("start")
					Dim finish As String = colroot.Get("finish")
					Dim id As String = colroot.Get("id")
					Dim userid As String = colroot.Get("userid")
					Dim imgpost As String = colroot.Get("imgpost")
					Dim target As String = colroot.Get("target")
					Dim status As String = colroot.Get("status")
					Dim token As String = colroot.Get("token")
					
					l_users(0).Add(uid)
					l_users(1).Add(types)
					l_users(2).Add(start)
					l_users(3).Add(finish)
					l_users(4).Add(id)
					l_users(5).Add(userid)
					l_users(6).Add(target)
					l_users(7).Add(status)
					l_users(8).Add(token)
					l_users(9).Add(imgpost)
					l_users(10).Add(codes)
					
				Next
				
				LV.notifyDataSetChanged
				
			
					
			Else
				ToastMessageShow("سفارشی یافت نشد",False)
			End If
			

		
	End Select
End Sub

