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
	
	Dim telegs As milad_telegramv3
	Type Adap_search (chat_id As Long,img_isdwonload As String,img_remote As String,img_id As String,img_my As String, title As String,topmsg_info As String, topdate As String,chat_type As String,ChatConstructor As String,channel_info As String,group_info As String,privatechat_info As String,topmasg_type As String,unreadCount As Int,photoid As Int)
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
	Dim cardchannel As CardView
	Dim listchats As List
	Dim edit As EditText
	Dim id_user As String
	Dim pnl_dilogs As Panel
	Dim username_target,title_target As String
	Dim id_target As String
	Dim img_target,idchannel_target As String
	Dim mimeno As mi_meno
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
'	mimeno.Initialize("mimeno",Me)
'	mimeno.addpnl
'	
	telegs.Initialize("telegs")
	listchats.Initialize
	
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
	
	Dim bg As ColorDrawable
	bg.Initialize2(Colors.White,5dip,2dip,Colors.LightGray)
	pnl_lv.Initialize("pnl_lv")
	pnl_lv.Background=bg
	Activity.AddView(pnl_lv,5%x,12%y,100%x-10%x,90%y-7%x)
	
	Dim lbl_a As Label
	lbl_a.Initialize("lbl_a")
	lbl_a.TextColor=Colors.DarkGray
	lbl_a.TextSize=14
	lbl_a.Typeface=Typeface.LoadFromAssets("iran_sans.ttf")
	lbl_a.Text="ثبت کانال جدید"
	lbl_a.Gravity=Gravity.CENTER_VERTICAL+Gravity.CENTER_HORIZONTAL
	pnl_lv.AddView(lbl_a,5%x,0,pnl_lv.Width-10%x,10%x)
	
	Dim card As CardView
	card.Initialize("")
	card.Color=Colors.White
	pnl_lv.AddView(card,5%x,lbl_a.Top+lbl_a.Height,pnl_lv.Width-10%x,17%x)
	
	Dim pnl_search As Panel
	pnl_search.Initialize("")
	card.AddView(pnl_search,0,0,card.Width,card.Height)
	
	Dim bg As ColorDrawable
	bg.Initialize(0xFF0072FF,20dip)
	
	Dim lbl_search As Label
	lbl_search.Initialize("lbl_search")
	lbl_search.TextColor=Colors.White
	lbl_search.TextSize=12
	lbl_search.Background=bg
	lbl_search.Typeface=Typeface.LoadFromAssets("iran_sans.ttf")
	lbl_search.Text="جستجو"
	lbl_search.Gravity=Gravity.CENTER_VERTICAL+Gravity.CENTER_HORIZONTAL
	pnl_search.AddView(lbl_search,pnl_search.Width-18%x,0,15%x,pnl_search.Height)
	pnl_search.Padding = Array As Int (10dip, 10dip, 10dip, 10dip)
	
	edit.Initialize("edit")
	edit.TextColor=Colors.DarkGray
	edit.TextSize=15
	edit.Hint="Channel Username"
	edit.HintColor=Colors.LightGray
	edit.Gravity=Gravity.CENTER_VERTICAL+Gravity.LEFT
	pnl_search.AddView(edit,0,0,pnl_search.Width-19%x,pnl_search.Height)
	
	cardchannel.Initialize("cardchannel")
	cardchannel.Color=Colors.White
	cardchannel.Visible=False
	pnl_lv.AddView(cardchannel,5%x,card.Top+card.Height+10%x,pnl_lv.Width-10%x,15%y)
	
	req_getme(userid_t)
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub meno_Click
'	Activity.Finish
'	StartActivity(Me)
	mimeno.Initialize("mimeno",Me)
	mimeno.addpnl
	mimeno.open

End Sub

Sub lbl_search_Click
'	telegs.Getme()
'	telegs.searchPublicChat("linkdoonii")
	telegs.searchPublicChat(edit.Text)
	ProgressDialogShow("درحال جستوجو...")
End Sub

Sub showsearch(isshow As Boolean)
	If isshow=True Then
		cardchannel.Visible=True
		Dim pnl As Panel
		pnl.Initialize("")
		cardchannel.AddView(pnl,0,0,cardchannel.Width,cardchannel.Height)
		channell_onCreateViewHolder(pnl)
		Else
			cardchannel.Visible=False
	End If
End Sub

Sub telegs_searchpublicchat(value As String)
	Log(value)
	listchats.Initialize
	ProgressDialogHide
	Dim parser As JSONParser
	parser.Initialize(value)
	Dim root As Map = parser.NextObject
	Dim Chat_type As String = root.Get("Chat_type")
	Dim photo_l_canBeDeleted As String = root.Get("photo_l_canBeDeleted")
	Dim Chat_id As String = root.Get("Chat_id")
	Dim photo_id As String = root.Get("photo_id")
	Dim photo_r_isUploadingActive As String = root.Get("photo_r_isUploadingActive")
	Dim photo_r_id As String = root.Get("photo_r_id")
	Dim Chat_title As String = root.Get("Chat_title")
	Dim photo_l_canBeDownloaded As String = root.Get("photo_l_canBeDownloaded")
	Dim Chat_clientData As String = root.Get("Chat_clientData")
	Dim photo_r_uploadedSize As String = root.Get("photo_r_uploadedSize")
	Dim photo_l_path As String = root.Get("photo_l_path")
	Dim photo_l_isDownloadingCompleted As String = root.Get("photo_l_isDownloadingCompleted")
	Dim channel_info As String = root.Get("channel_info")
	Dim photo_size As String = root.Get("photo_size")
	Dim Chat_type As String = root.Get("chat_type")
	Dim photo_l_downloadedSize As String = root.Get("photo_l_downloadedSize")
	Dim photo_l_isDownloadingActive As String = root.Get("photo_l_isDownloadingActive")
	Dim photo_expectedSize As String = root.Get("photo_expectedSize")
	Dim photo_r_isUploadingCompleted As String = root.Get("photo_r_isUploadingCompleted")
	Dim photo_l_downloadedPrefixSize As String = root.Get("photo_l_downloadedPrefixSize")
	Dim Chat_order As String = root.Get("Chat_order")

	
	Dim Item As Adap_chats
	Item.chat_id=Chat_id
	Item.title=Chat_title
'	Item.topdate=topdate
	Item.chat_type=Chat_type
	Item.channel_info=channel_info
'	Item.group_info=group_info
'	Item.privatechat_info=privatechat_info
'	Item.topmasg_type=topmasg_type
'	Item.topmsg_info=topmsg_info
'	Item.unreadCount=unreadCount
'	Item.ChatConstructor=ChatConstructor
		
	Item.img_isdwonload=photo_l_isDownloadingCompleted
	Item.img_id=photo_id
	Item.img_remote=photo_r_id
	Item.img_my=photo_l_path
	listchats.Add(Item)
	showsearch(True)
'	telegs.Joinchannel("linkdoni",userid_t)

End Sub


Sub channell_onCreateViewHolder (Parent As Panel)      '# onCreate #'
	Dim Item = listchats.Get(0) As Adap_chats
	
	
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
	lbl_iconchat.Typeface=Typeface.FONTAWESOME
	lbl_iconchat.Text=Chr(0xF0A1)
	
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
	
	lbl_sef.Tag=0
	
	lbl.Text = Item.title
	If Item.img_isdwonload="true" Then
		
'		img_prof.Bitmap = LoadBitmap("",Item.img_my)
		glide.Load("",Item.img_my).OptionalCircleCrop.Into(img_prof)
	Else
		glide.Load(File.DirAssets,"lazyloader.gif").FitCenter.Into(img_prof)

		If Item.img_id="null" Then
		Else
			telegs.downloadFile(Item.img_id)
				
		End If

	End If
	
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
					showsearch(True)
'					LV.notifyItemChanged(ss)
			
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

Sub telegs_errormsg(value As String)
	LogColor(value,Colors.Blue)
	ProgressDialogHide
	Dim parser As JSONParser
	parser.Initialize(value)
	Dim root As Map = parser.NextObject
	Dim Error_msg As String = root.Get("Error_msg")
	Dim ErrorConstructor As Int = root.Get("ErrorConstructor")
	Dim Error_code As Int = root.Get("Error_code")
	ToastMessageShow(Error_msg,False)
End Sub

Sub telegs_getme(value As String)
	LogColor(value,Colors.Blue)
	Dim parser As JSONParser
	parser.Initialize(value)
	Dim root As Map = parser.NextObject
	Dim lastName As String = root.Get("lastName")
	Dim firstName As String = root.Get("firstName")
	Dim phoneNumber As String = root.Get("phoneNumber")
	Dim profilePhoto As String = root.Get("profilePhoto")
	Dim isVerified As String = root.Get("isVerified")
	Dim id As Int = root.Get("id")
	Dim restrictionReason As String = root.Get("restrictionReason")
	Dim haveAccess As String = root.Get("haveAccess")
	Dim Typess As String = root.Get("type")
	Dim username As String = root.Get("username")
	Dim status As String = root.Get("status")
	id_user=id
'	telegs.searchPublicChat(edit.Text)
'	ProgressDialogShow("درحال جستوجو...")
End Sub

Sub lbl_sef_Click
	Dim lbl As Label
	lbl=Sender
	Dim Item = listchats.Get(lbl.Tag) As Adap_chats
	Log(Item.title)
	chatid=Item.chat_id
	title_target=Item.title
	If Item.img_id="null" Then
		img_target="none"
	Else
		img_target=Item.img_my
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

Sub telegs_joinchannel(value As String)
	LogColor(value,Colors.Blue)
	
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
					mt_sef.us_name=username_target
					mt_sef.idchannel_t=idchannel_target
					mt_sef.titelchat_target=title_target
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
			Dim pnlmain As Panel
			pnlmain.Initialize("")
			pnlmain.Background=bg
			pnl_dilogs.AddView(pnlmain,5%x,10%x,pnl_dilogs.Width-10%x,pnl_dilogs.Height-20%x)
			
			mt_sef.Type_sef=typesef
			mt_sef.img_address_target=img_target
			mt_sef.addpnl(pnlmain)
			
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
	Dim username As String = root.Get("username")
	Dim status As String = root.Get("status")
'	
	id_target=id
	username_target=username
'	ToastMessageShow(username,False)

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
