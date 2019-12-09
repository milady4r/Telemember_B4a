B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=7.3
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	Type Adap_chats (chat_id As Long,img_isdwonload As String,img_remote As String,img_id As String,img_my As String, title As String,topmsg_info As String, topdate As String,chat_type As String,ChatConstructor As String,channel_info As String,group_info As String,privatechat_info As String,topmasg_type As String,unreadCount As Int,photoid As Int)
	Dim listchats As List
	Dim telegs As milad_telegramv3
	Private sql1 As SQL
	Private cursor1 As Cursor
	Dim username_t ,userid_t As String
	Dim chatid As String
	
	
End Sub

Sub Globals
	Dim meno As Label
	Dim pnl_coins As Panel
	Dim lbl_icon ,lbl_nums As Label
	Dim roundview As MC7RoundView
	Dim LV As Hitex_LayoutView
	Dim glide As Hitex_Glide
	
	Dim pnl_lv As Panel
	Dim pnl_dilogs As Panel
	Dim username_target,title_target As String
	Dim id_target ,idchannel_target As String
	Dim img_target As String
	
	Dim mimeno As mi_meno
	Dim us_name As String
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
'	mimeno.Initialize("mimeno",Me)
'	mimeno.addpnl
	
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
	cursor1.Close
	
	listchats.Initialize
	'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''	
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
	
	Dim bg As ColorDrawable
	bg.Initialize2(Colors.White,5dip,2dip,Colors.LightGray)
	pnl_lv.Initialize("pnl_lv")
	pnl_lv.Background=bg
	Activity.AddView(pnl_lv,5%x,12%y,100%x-10%x,90%y-7%x)
	
	Dim lbl_a As Label
	lbl_a.Initialize("lbl_a")
	lbl_a.TextColor=Colors.DarkGray
	lbl_a.TextSize=20
	lbl_a.Typeface=Typeface.LoadFromAssets("iran_sans.ttf")
	lbl_a.Text="کانال های شما"
	lbl_a.Gravity=Gravity.CENTER_VERTICAL+Gravity.CENTER_HORIZONTAL
	pnl_lv.AddView(lbl_a,5%x,0,pnl_lv.Width-10%x,10%x)
	
	Dim bg As ColorDrawable
	bg.Initialize2(0xFF0072FF,5dip,2dip,0xFF003BFF)
	
	Dim lbl_addchannel As Label
	lbl_addchannel.Initialize("lbl_addchannel")
	lbl_addchannel.TextColor=Colors.White
	lbl_addchannel.TextSize=20
	lbl_addchannel.Background=bg
	lbl_addchannel.Typeface=Typeface.LoadFromAssets("iran_sans.ttf")
	lbl_addchannel.Text="ثبت کانال جدید"
	lbl_addchannel.Gravity=Gravity.CENTER_VERTICAL+Gravity.CENTER_HORIZONTAL
	pnl_lv.AddView(lbl_addchannel,5%x,lbl_a.Top+lbl_a.Height+2%x,pnl_lv.Width-10%x,10%x)
	
	LV.Initializer("LV").ListView.FastScrollType(2).Build
	pnl_lv.AddView(LV,0,lbl_addchannel.Top+lbl_addchannel.Height+2%x,pnl_lv.Width,pnl_lv.Height-lbl_addchannel.Top-lbl_addchannel.Height-3%x)
	LV.CardView.CardElevation(4dip).Radius(2dip)
	LV.Show
	
	
	telegs.Initialize("telegs")
	telegs.getChats(0,0,100)
	
'	telegs.getChatList(10)
	req_getme(userid_t)
	
End Sub

Sub Activity_Resume
	req_getme(userid_t)

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub LV_onCreateViewHolder (Parent As Panel, ViewType As Int)      '# onCreate #'
	Parent.Color=Colors.White
	Parent.Height=15%y
	
	Dim pnl_main As Panel
	pnl_main.Initialize("")
	pnl_main.Color=Colors.White
	Parent.AddView(pnl_main,2%x,2%x,Parent.Width-4%x,15%y)
	
	Dim lbl As Label: lbl.Initialize("lbl")
	lbl.TextColor = Colors.Black : lbl.TextSize = 18
	lbl.Gravity=Gravity.RIGHT+Gravity.CENTER_VERTICAL
	lbl.TextSize=14
'	lbl.Color=Colors.LightGray
	pnl_main.AddView(lbl,2%x,5dip,pnl_main.Width-17%x,10%x)
	
	Dim lbl_iconchat As Label: lbl_iconchat.Initialize("lbl_iconchat")
	lbl_iconchat.TextColor = Colors.Black : lbl_iconchat.TextSize = 30
	pnl_main.AddView(lbl_iconchat,5%x,5%x,10%x,10%x)
'	lbl_iconchat.Typeface=Typeface.MATERIALICONS
'	lbl_iconchat.Text=Chr(0xE7EF)
	
	Dim img_prof As ImageView
	img_prof.Initialize("img_prof")
'	img_prof.Bitmap=LoadBitmap(File.DirAssets,"default-user.png")
	img_prof.Gravity=Gravity.FILL
	pnl_main.AddView(img_prof,pnl_main.Width-13%x,5dip,12%x,12%x)
	
	Dim divi As Panel: divi.Initialize("divi")
	divi.Color=0xFFE1E5E6
	pnl_main.AddView(divi,0,15%y,100%x-78dip,1dip)
	
	Dim lbl_topmsg As Label: lbl_topmsg.Initialize("lbl_topmsg")
	lbl_topmsg.TextColor = 0xFFABACAE : lbl_topmsg.TextSize = 14
	lbl_topmsg.Gravity=Gravity.RIGHT
	lbl_topmsg.Visible=False
	pnl_main.AddView(lbl_topmsg,30dip,40dip,100%x-110dip,20dip)
	
	Dim lbl_time As Label: lbl_time.Initialize("lbl_time")
	lbl_time.TextColor = 0xFFABACAE : lbl_time.TextSize = 14
	'lbl_time.Gravity=Gravity
	lbl_time.Visible=False
	pnl_main.AddView(lbl_time,5dip,10dip,100dip,20dip)
	
	Dim lbl_unread As Label: lbl_unread.Initialize("lbl_unread")
	lbl_unread.TextColor = 0xFFFFFFFF : lbl_unread.TextSize = 14
	Dim red As ColorDrawable
	red.Initialize(0xFF1EF47C,60)
	lbl_unread.Background=red
	lbl_unread.Gravity=Gravity.CENTER
	lbl_unread.Visible=False
	pnl_main.AddView(lbl_unread,10dip,40dip,20dip,20dip)
	
	Dim bg As ColorDrawable
	bg.Initialize2(0xFFE3192E,5dip,2dip,0xFFEC5765)
	Dim lbl_sef As Label: lbl_sef.Initialize("lbl_sef")
	lbl_sef.TextColor = Colors.White : lbl_sef.TextSize = 18
	lbl_sef.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lbl_sef.TextSize=17
	lbl_sef.Text="سفارش"
	lbl_sef.Background=bg
'	lbl.Color=Colors.LightGray
	pnl_main.AddView(lbl_sef,pnl_main.Width/2-5%x,img_prof.Top+img_prof.Height+1%x,pnl_main.Width/2-10%x,8%x)
	
End Sub
Sub LV_onBindViewHolder (Parent As Panel, Position As Int)         '* onBind *'
	Dim Item = listchats.Get(Position) As Adap_chats
	Dim pnl_main =Parent.GetView(0) As Panel
	Dim lbl = pnl_main.GetView(0) As Label
	Dim lbl_iconchat = pnl_main.GetView(1) As Label
	Dim img_prof = pnl_main.GetView(2) As ImageView
	Dim divi = pnl_main.GetView(3) As Panel
	Dim lbl_topmsg = pnl_main.GetView(4) As Label
	Dim lbl_time = pnl_main.GetView(5) As Label
	Dim lbl_unread = pnl_main.GetView(6) As Label
	Dim lbl_sef = pnl_main.GetView(7) As Label
	
	lbl_sef.Tag=Position
	
	
	Dim dir,names As String
'	img_prof.Bitmap=LoadBitmap("",path)
	'glides.Load("",path).CircleCrop.Into(img_prof)
	Dim ExpDate As Long = DateUtils.UnixTimeToTicks(Item.topdate)
	'	Log(DateTime.Date(ExpDate)  & " " & DateTime.time(ExpDate))
	lbl_time.Text=DateTime.time(ExpDate)
	
	If Item.unreadCount>0 Then
'		lbl_unread.Visible=True
		
'		lbl_unread.Text=Item.unreadCount
	End If
	
	Dim s As Int
	Dim su As StringUtils
	lbl.Text = Item.title
	s = su.MeasureMultilineTextHeight(lbl,lbl.Text)+50%x
'	Log("typesssss: "&Item.ChatConstructor)
	
	Select Item.ChatConstructor
		Case "955152366"  ''channel
			Dim parser As JSONParser
			parser.Initialize(Item.channel_info)
			Dim root As Map = parser.NextObject
			Dim id_channelinfo As Int = root.Get("supergroupId")
			Dim isSupergroup As String = root.Get("isChannel")
			
			If isSupergroup=True Then
				lbl_iconchat.Typeface=Typeface.FONTAWESOME
				lbl_iconchat.Text=Chr(0xF0A1)
			Else
				lbl_iconchat.Typeface=Typeface.FONTAWESOME
				lbl_iconchat.Text=Chr(0xF0C0)
			End If
			
		Case "1276053779"  ''group
			lbl_iconchat.Typeface=Typeface.MATERIALICONS
			lbl_iconchat.Text=Chr(0xE7EF)
		
		
		Case "-241270753"   ''private chat
			lbl_iconchat.Typeface=Typeface.FONTAWESOME
			lbl_iconchat.Text=Chr(0xF2C0)
	End Select
'	lbl.Width=s
	
	Select Item.topmasg_type
		Case "photo"
			
			Dim parser As JSONParser
			parser.Initialize(Item.topmsg_info)
			Dim root As Map = parser.NextObject
			Dim photoid_topmsg As String = root.Get("photoid_topmsg")
			Dim caption_topmsg As String = root.Get("caption_topmsg")
			
			If caption_topmsg.Length>60 Then
				
				lbl_topmsg.Text=caption_topmsg.SubString2(0,50)&"..."
			Else
				lbl_topmsg.Text=caption_topmsg
					
			End If
			
		
		Case "document"
			Dim parser As JSONParser
			parser.Initialize(Item.topmsg_info)
			Dim root As Map = parser.NextObject
			Dim msgdoc_caption As String = root.Get("msgdoc_caption")
			If msgdoc_caption.Length>60 Then
				
				lbl_topmsg.Text=msgdoc_caption.SubString2(0,50)&"..."
			Else
				lbl_topmsg.Text=msgdoc_caption
					
			End If
			
		Case "message"
			Dim parser As JSONParser
			parser.Initialize(Item.topmsg_info)
			Dim root As Map = parser.NextObject
'			Dim msg_entities As Int = root.Get("msg_entities")
			Dim msg_text As String = root.Get("msg_text")
			
			If msg_text.Length>60 Then
				
				lbl_topmsg.Text=msg_text.SubString2(0,50)&"..."
			Else
				lbl_topmsg.Text=msg_text
					
			End If
		Case "voice"
			
			
	End Select
	
	
	If Item.img_isdwonload="true" Then
				
'		img_prof.Bitmap = LoadBitmap("",Item.img_my)
		glide.Load("",Item.img_my).OptionalCircleCrop.Into(img_prof)
	Else
		glide.Load(File.DirAssets,"lazyloader.gif").FitCenter.Into(img_prof)
'		LogColor("img nist $ download",Colors.Green)
		If Item.img_id="null" Then
		Else
			telegs.downloadFile(Item.img_id)
				
		End If
	End If
	
	
	
	
'	Log(Position)
'	If list_chats(3).Size>15 Then
'		If Position=list_chats(3).Size-5 Then
'			Log("is pk")
'			ToastMessageShow("next...",True)
'			Dim ss=list_chats(3).Size As Int
'			telegs.getChatList(ss)
'
'		End If
'	End If
	
	
	
End Sub

Sub LV_GetItemCount As Int 								        '$ ItemCount $'
	Return listchats.Size 'ItemList.Size
End Sub


Sub telegs_getchat(value As String)

	Dim parser As JSONParser
	parser.Initialize(value)
	Dim root As List = parser.NextArray
	For Each colroot As Map In root
		Dim photosmall_id As Int
		If colroot.Get("photosmall_id")=Null Then
		Else
			photosmall_id	=colroot.Get("photosmall_id")
		End If
		Dim chat_id As Long = colroot.Get("chat_id")
		Dim title As String = colroot.Get("title")
		Dim ChatConstructor As String = colroot.Get("ChatConstructor")
		Dim topdate As String = colroot.Get("topdate")
		Dim chat_type As String = colroot.Get("chat_type")
		Dim channel_info As String = colroot.Get("channel_info")
		Dim group_info As String = colroot.Get("group_info")
		Dim privatechat_info As String = colroot.Get("privatechat_info") '
		Dim replyToMessageId As String = colroot.Get("replyToMessageId")
		Dim lastReadInboxMessageId As String = colroot.Get("lastReadInboxMessageId")
		Dim lastReadOutboxMessageId As String = colroot.Get("lastReadOutboxMessageId")
		Dim unreadCount As String = colroot.Get("unreadCount")
		
		Dim photo_id As String = colroot.Get("photo_id")
		Dim photo_l_isDownloadingCompleted As String = colroot.Get("photo_l_isDownloadingCompleted")
		Dim photo_l_path As String = colroot.Get("photo_l_path")
		Dim photo_r_id As String = colroot.Get("photo_r_id")
		
'		Dim unreadCount As String = colroot.Get("unreadCount")
'		Dim unreadCount As String = colroot.Get("unreadCount")
		
            
		Log("chat : "&title&"reply :"& replyToMessageId&" lastin : "&lastReadInboxMessageId&" lastout : "&lastReadOutboxMessageId&" unread : "&unreadCount)
		
		Dim content As Long = colroot.Get("content")
		'Dim content_msg As String = colroot.Get("content_msg")
			
		Dim topmasg_type As String = colroot.Get("topmasg_type")
		Dim topmsg_info As String = colroot.Get("topmsg_info")
        
		Select ChatConstructor
			Case "955152366"  ''channel
				Dim parser_a As JSONParser
				parser_a.Initialize(channel_info)
				Dim root_a As Map = parser_a.NextObject
				Dim id_channelinfo As Int = root_a.Get("supergroupId")
				Dim isSupergroup As String = root_a.Get("isChannel")
			
				If isSupergroup=True Then
'					lbl_iconchat.Typeface=Typeface.FONTAWESOME
'					lbl_iconchat.Text=Chr(0xF0C0)

					Dim Item As Adap_chats
					Item.chat_id=chat_id
					Item.title=title
					Item.topdate=topdate
					Item.chat_type=chat_type
					Item.channel_info=channel_info
					Item.group_info=group_info
					Item.privatechat_info=privatechat_info
					Item.topmasg_type=topmasg_type
					Item.topmsg_info=topmsg_info
					Item.unreadCount=unreadCount
					Item.ChatConstructor=ChatConstructor
		
					Item.img_isdwonload=photo_l_isDownloadingCompleted
					Item.img_id=photo_id
					Item.img_remote=photo_r_id
					Item.img_my=photo_l_path
					listchats.Add(Item)
					LV.notifyItemAdded
				Else
'					lbl_iconchat.Typeface=Typeface.FONTAWESOME
'					lbl_iconchat.Text=Chr(0xF0A1)


				End If
		End Select
		
'		LV.SmoothScrollToPosition(ItemList.Size)
		
	Next

	LogColor("meg_chatId "&chat_id,Colors.Blue)
	
	LV.notifyDataSetChanged
	
End Sub


Sub telegs_update_file(respon As String)
'	LogColor("imf :"&respon,Colors.Red)
	LogColor(respon,Colors.Blue)
	Dim parser As JSONParser
	parser.Initialize(respon)
	Dim root As Map = parser.NextObject
	Dim photof_remot_id As String = root.Get("photof_remot_id")
	Dim photof_local_candownload As String = root.Get("photof_local_candownload")
	Dim photof_local_isdownload As String = root.Get("photof_local_isdownload")
	Dim photof_expectedSize As Int = root.Get("photof_expectedSize")
	Dim photof_remot_uploadsize As Int = root.Get("photof_remot_uploadsize")
	Dim photof_size As Int = root.Get("photof_size")
	Dim photof_remot_isuploadactive As String = root.Get("photof_remot_isuploadactive")
	Dim photof_local_perfexsize As Int = root.Get("photof_local_perfexsize")
	Dim photof_remot_isuploadcomplit As String = root.Get("photof_remot_isuploadcomplit")
	Dim photof_local_downloadsize As Int = root.Get("photof_local_downloadsize")
	Dim photof_local_canbedlelte As String = root.Get("photof_local_canbedlelte")
	Dim photof_id As Int = root.Get("photof_id")
	Dim photof_local_isdowloaded As String = root.Get("photof_local_isdowloaded")
	Dim photof_localpath As String = root.Get("photof_localpath")
	
	Log(" isdowloaded "&photof_local_isdowloaded&" size "&photof_size&" dl size : "&photof_local_downloadsize&" is download "&photof_local_isdownload&" can dl : "&photof_local_candownload)
	Log("p : "&photof_localpath)
	
	Try
		If photof_local_isdowloaded="true" Then
			For ss=0 To listchats.Size-1
				Dim Itema = listchats.Get(ss) As Adap_chats
				If Itema.img_id=photof_id Then
					Log(ss&" img id ready!")
					
					Itema.img_my = photof_localpath
					Itema.img_isdwonload=photof_local_isdowloaded
					Itema.img_remote=photof_remot_id
					Itema.img_id=photof_id
				
					LV.notifyItemChanged(ss)
			
				End If

			Next
			
		End If

	Catch
		Log(LastException)
	End Try
	
	
'	If isreadyimg=0 Then
'		
'	End If
	
	
End Sub

Sub lbl_sef_Click
	
'	Dim str="/data/data/com.ins.social/cache/milad/profile_photos/37905.jpg" As String
'	str=str.SubString2(str.IndexOf("profile_photos"),str.Length)
'	str=str.Replace("profile_photos/","")
'	Log(str)
	
	
	
	Dim lbl As Label
	lbl=Sender
	Dim Item = listchats.Get(lbl.Tag) As Adap_chats
	Log(Item.title)
	chatid=Item.chat_id
	title_target=Item.title
	LogColor(" img id : "&Item.img_my.Length,Colors.Red)
	If Item.img_my.Length>5 Then
		
		img_target=Item.img_my
		
	Else
		img_target="http://filework.ir/INSTAFOLLOW/api/asset/noimage.png"
		LogColor(" no img : ",Colors.Red)
	End If
	Dim parser As JSONParser
	parser.Initialize(Item.channel_info)
	Dim root As Map = parser.NextObject
	Dim id_channelinfo As Int = root.Get("supergroupId")
	Dim isSupergroup As String = root.Get("isChannel")
	idchannel_target=id_channelinfo
	
'	telegs.Getchannelinfo(id_channelinfo)
	telegs.Getchanneluser(id_channelinfo)


End Sub

Sub Dialog_ItemSelected (Dialog As MaterialDialog, Position As Int, Text As String)
'	Log($"Item Selected سسس: ${Position} : ${Text}"$)
'	ToastMessageShow(Text, False)
	Select Position
		
		Case 0:
			show_pnldialogs(True,0)
		Case 1:
			show_pnldialogs(True,3)
		
		
	End Select
End Sub

Sub lbl_addchannel_Click
	StartActivity(ac_tsearch)
	
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
		
	End Select
End Sub

Sub show_pnldialogs(isshsowa As Boolean,typesef As Int)
	Select isshsowa
		Case True:
			pnl_dilogs.Initialize("pnl_dilogs")
			pnl_dilogs.Color=Colors.LightGray
			Activity.AddView(pnl_dilogs,0,20%x,100%x,100%y-20%x)
			
			Dim lbl_s As Label
			lbl_s.Initialize("lbl_nums")
			lbl_s.TextColor=Colors.White
			lbl_s.TextSize=20
			lbl_s.Typeface=Typeface.LoadFromAssets("iran_sans.ttf")
			lbl_s.Gravity=Gravity.CENTER_VERTICAL+Gravity.RIGHT
			pnl_dilogs.AddView(lbl_s,2%x,0,pnl_dilogs.Width-15%x,10%x)
			
			Dim mt_sef As mt_sef
			mt_sef.Initialize("mt_sef",Me)
			
			Select typesef
				Case 0:
					lbl_s.Text="سفارش ممبر"
					mt_sef.username_target=username_target
					
				Case 3:
					lbl_s.Text="سفارش ویو"
					mt_sef.username_target=chatid
					mt_sef.idchannel_t=idchannel_target
					mt_sef.titelchat_target=title_target
					mt_sef.us_name=us_name
			End Select
			
			Dim lbl_x As Label
			lbl_x.Initialize("lbl_x")
			lbl_x.TextColor=Colors.White
			lbl_x.TextSize=28
			lbl_x.Typeface=Typeface.MATERIALICONS
			lbl_x.Gravity=Gravity.CENTER_VERTICAL+Gravity.CENTER_HORIZONTAL
			lbl_x.Text=Chr(0xE5C8)
			pnl_dilogs.AddView(lbl_x,pnl_dilogs.Width-15%x,0,15%x,10%x)
			
			Dim bg As ColorDrawable
			bg.Initialize2(Colors.White,5dip,2dip,Colors.LightGray)
			
			Dim bgs As ColorDrawable
			bgs.Initialize2(Colors.White,5%x,2dip,Colors.LightGray)
	         
			Dim pnlmain As Panel
			pnlmain.Initialize("")
			pnlmain.Background=bg
			pnl_dilogs.AddView(pnlmain,5%x,10%x,pnl_dilogs.Width-10%x,pnl_dilogs.Height-20%x)
			
			Dim pp As Panel
			pp.Initialize("pp")
			pnlmain.AddView(pp,3%x,2%x,pnlmain.Width-6%x,pnlmain.Height-4%x)
			
			mt_sef.Type_sef=typesef
			mt_sef.img_address_target=img_target
			mt_sef.addpnl(pp)
			
		Case False:
			If pnl_dilogs.IsInitialized=True And pnl_dilogs.Enabled=True Then
				pnl_dilogs.Visible=False
				pnl_dilogs.Enabled=False	
			End If
	End Select
End Sub

Sub pnl_dilogs_Touch (Action As Int, X As Float, Y As Float)
	show_pnldialogs(False,0)
End Sub

Sub lbl_x_Click
	show_pnldialogs(False,0)
	
End Sub

Sub telegs_getsupergroup(value As String)
	Log(value)
	Dim parser As JSONParser
	parser.Initialize(value)
	Dim root As Map = parser.NextObject
	Dim date As Int = root.Get("date")
	Dim isVerified As String = root.Get("isVerified")
	Dim isChannel As String = root.Get("isChannel")
	Dim signMessages As String = root.Get("signMessages")
	Dim memberCount As Int = root.Get("memberCount")
	Dim id As Int = root.Get("id")
	Dim restrictionReason As String = root.Get("restrictionReason")
	Dim anyoneCanInvite As String = root.Get("anyoneCanInvite")
	Dim usernames As String = root.Get("username")
	Dim status As String = root.Get("status")
'	
	id_target=id
	username_target=usernames
'	ToastMessageShow(username,False)
	us_name=usernames
	Dim Builder As MaterialDialogBuilder
	Builder.Initialize("Dialog")
	
	Builder.Items(Array As String("سفارش ممبر برای کانال "&title_target,"سفارش ویو برای کانال "&title_target))
	Builder.ItemsCallback
	Builder.Show

End Sub

Sub mt_sef_newcoins(news As String)
	Dim n_coins=news As Long
	If n_coins>100 Then
		lbl_nums.Text="سکه "&NumberFormat(news,3,0)
	Else
		lbl_nums.Text="سکه "&news
	End If
End Sub

Sub meno_Click
	mimeno.Initialize("mimeno",Me)
	mimeno.addpnl
	mimeno.open
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean
	If KeyCode = KeyCodes.KEYCODE_BACK Then
		StartActivity(ac_tselect)
		Activity.Finish
		Return True
	End If
    
End Sub
