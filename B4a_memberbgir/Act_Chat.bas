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
	Dim Timer,Timer2,tm As Timer
	Public MINE = 0, Their = 1,MINEST = 2,MINEST2 = 3,VIDEOME=4,VIDEOthire=5 As Int
	Public IMAGENAME As String
	Public NAME As String
	Dim msg() As String
'	Private telegs As milad_telegramv3
	Dim name_chat ,chat_id,numcoins,numfinish,channelid,imgchat As String
	Dim list_dl As String
	
	Private sql1 As SQL
	Private cursor1 As Cursor
	Dim us_name As String
End Sub

Sub Globals
	Private telegs As milad_telegramv3
	Private progressDialog As MaterialDialog
	
	Dim upl As UploadRequest
	Dim pr As PersianFastNetwork
	
	Private LV As Hitex_LayoutView
	Dim re As Hitex_RevealLayout
	Private EditText As EditText
	Private BtnSend,Btnatt,Mic,Stic As ImageView
	Public ItemList As List
	Type Adapter (ViewType As Int, MyText As String, TheirText As String,img_my As String,img_isdwonload As String,img_id As String,img_remote As String,msg_id As String,caption_topmsg As String , iscaptions As Int)
	Private XML As XmlLayoutBuilder
	Private AppCompat As AppCompat
	Private Toolbar As Panel
	Dim Status As Label
	Private Height As Int
	Private Canvas As Canvas
	Private Font As Typeface
	Dim SB As StringBuilder
	Private Glide As Hitex_Glide
	Dim Pan As Panel
	Dim StrUtil As StringUtils
	Dim ht As Float
	Dim an As Animation
	Dim IME As IME
	Dim q = 0,q2 = 0 As Int
	Dim Top As Int = 100%y-61%x
	Dim sho = False As Boolean
	
	Dim stp As Panel
	Dim username_t ,userid_t As String
	Dim msg_id_select As String
End Sub

Sub Activity_Create(FirstTime As Boolean)
	pr.initialize("pr")
	If File.Exists(File.DirInternal,"instadb.db")=False Then
		File.Copy(File.DirAssets,"instadb.db",File.DirInternal,"instadb.db")
	End If
	If sql1.IsInitialized=False Then
		sql1.Initialize(File.DirInternal,"instadb.db",False)
	
	End If
	
	cursor1 = sql1.ExecQuery("SELECT * FROM tbl_tele WHERE soich='1'")
	Dim i As Int
	For i=0 To cursor1.RowCount-1
		cursor1.Position=i
		userid_t=cursor1.GetString("userid")
		username_t=cursor1.GetString("username")
	Next
	cursor1.Close
	'''''''''''''''''''''''''''''''''''''''''''''''''''''''
	ItemList.Initialize
	IME.Initialize("IME")
	IME.AddHeightChangedEvent
	Font = Typeface.LoadFromAssets("iran_sans.ttf")
	SB.Initialize
	Toolbar.Initialize("Toolbar")
	Toolbar.Color = AppCompat.GetThemeAttribute("colorPrimary")
'	Toolbar.Title = NAME
	Activity.AddView(Toolbar,0,0,100%x,10%y)
	Toolbar.Elevation = 8dip
	Dim PersonImage As ImageView : PersonImage.Initialize("PersonImage")
	Toolbar.AddView(PersonImage,10%x,1%y,8%y,8%y)
	Glide.Load("",imgchat).OptionalCircleCrop.Into(PersonImage)
	Dim PersonName As Label : PersonName.Initialize("PersonName")
	Toolbar.AddView(PersonName,20%x+11%y,5dip,42%x,5%y)
	PersonName.Text = name_chat
	PersonName.Gravity = Gravity.LEFT
	PersonName.TextColor = 0xFFFAFAFA
	PersonName.TextSize = 18
	Private Font2 = Typeface.CreateNew(Font,Typeface.STYLE_BOLD) As Typeface
	PersonName.Typeface = Font2
	
	Status.Initialize("Status")
	Toolbar.AddView(Status,20%x+11%y,5%y,42%x,4%y)
	Status.Text = "last seen recently"
	Status.Gravity = Gravity.LEFT
	Status.TextColor = 0xFFFAFAFA
	Status.TextSize = 15
	Status.Typeface = Font

'	Dim Back As ImageView : Back.Initialize("Back")
'	Back.Background = XML.GetDrawable("ic_arrow")
'	Toolbar.AddView(Back,2.5%y,2.5%y,5%y,5%y)
'	
'	Dim More As ImageView : More.Initialize("More")
'	More.Background = XML.GetDrawable("ic_more")
'	Toolbar.AddView(More,100%x-7.5%y,2.5%y,5%y,5%y)
	
	Height = 99%y-Toolbar.Height
	
	LV.Initializer("LV").ListView.ReverseLayout.Build
	Activity.AddView(LV,0,Toolbar.Height,100%x,Height)
	
	
'	Pan.Initialize("")
'	Activity.AddView(Pan,0,90%y,100%x,10%y)
'	Pan.Color = 0xFFFAFAFA
'	
'	Stic.Initialize("Stic")
''	Stic.Bitmap = LoadBitmap(File.DirAssets,"Stickers.png")
'	Stic.Gravity = Gravity.FILL
'	Pan.AddView(Stic,5%x,(10%y-8%x)/2,8%x,8%x)
'	
'	EditText.Initialize("EditText")
'	Dim CD As ColorDrawable
'	CD.Initialize(0xFFFAFAFA,1dip)
'	EditText.Background = CD
'	EditText.Hint = "Message"
'	EditText.Typeface = Font
'	Pan.AddView(EditText,14%x,1%y,72%x,8%y)
'	
'	BtnSend.Initialize("BtnSend")
''	BtnSend.Bitmap = LoadBitmap(File.DirAssets,"send.png")
'	BtnSend.Gravity = Gravity.FILL
'	Pan.AddView(BtnSend,89%x,(10%y-7%x)/2,7%x,7%x)
'	BtnSend.Visible = False
'	
'	Mic.Initialize("Mic")
''	Mic.Bitmap = LoadBitmap(File.DirAssets,"mic.png")
'	Mic.Gravity = Gravity.FILL
'	Pan.AddView(Mic,90%x,(10%y-7%x)/2,5%x,7%x)
'	
'	Btnatt.Initialize("Btnatt")
''	Btnatt.Bitmap = LoadBitmap(File.DirAssets,"attach.png")
'	Btnatt.Gravity = Gravity.FILL
'	Pan.AddView(Btnatt,75%x,(10%y-7%x)/2,7%x,7%x)
	
	Activity.SetBackgroundImage(LoadBitmap(File.DirAssets,"background_hd.jpg"))

	LV.Ripple.Alpha(0).Color(Colors.Transparent)
	
	LV.Show
	
'	Timer.Initialize("Timer",1500)
'	Timer2.Initialize("Timer2",2500)
'	
	Canvas.Initialize(Activity)
'	
'	re.Initialize("re")
'	Activity.AddView(re,0,0,100%x,100%y)
'	re.Panel.Height = 61%x
'	re.Panel.Top = 100%y-61%x
'	
'	re.Panel.Color = 0xFFFAFAFA
'	re.Hide
	
'	REload
		
'	For i = 0 To msg.Length-1
'		
'		Dim Item As Adapter
'		Item.ViewType = Their
'		Item.TheirText = msg(i)	
'		ItemList.Add(Item)
'		LV.notifyItemAdded
'		LV.SmoothScrollToPosition(ItemList.Size)
'		
'	Next
	
	
	telegs.Initialize("telegs")
	telegs.getChatHistory(chat_id,0,0,1,False)
	
	
End Sub


Sub telegs_getchatshistory(value As String)
	'	Log(value)
	If value ="" Then
		Return
	Else
		Log("chats ready!")
		Dim parser As JSONParser
		parser.Initialize(value)
		Dim root As List = parser.NextArray
		For Each colroot As Map In root
			Dim meg_replyToMessageId As Int = colroot.Get("meg_replyToMessageId")
			Dim meg_chatId As Long = colroot.Get("meg_chatId")
			Dim meg_senderUserId As Int = colroot.Get("meg_senderUserId")
			Dim meg_editDate As Int = colroot.Get("meg_editDate")
			Dim meg_isPost As String = colroot.Get("meg_isPost")
			Dim meg_id As Long = colroot.Get("meg_id")
'			Log(meg_id)
			Dim meg_views As Int = colroot.Get("meg_views")
			Dim msg_type As String = colroot.Get("msg_type")
			Dim meg_canBeDeleted As String = colroot.Get("meg_canBeDeleted")
			Dim massege_info As String = colroot.Get("massege_info")
			Dim meg_viaBotUserId As Int = colroot.Get("meg_viaBotUserId")
			Dim meg_date As Int = colroot.Get("meg_date")
			Dim meg_canBeEdited As String = colroot.Get("meg_canBeEdited")
			Dim ReplyMarkup As String = colroot.Get("ReplyMarkup")
			Log("ReplyMarkup: "&ReplyMarkup)
			LogColor(meg_id,Colors.Blue)
			
			Select msg_type
				Case "message":
					Dim parser_msg As JSONParser
					parser_msg.Initialize(massege_info)
					Dim root_msg As Map = parser_msg.NextObject
					Dim msg_text As String = root_msg.Get("msg_text")
			
					Dim Item As Adapter
					Item.ViewType = Their
					Item.TheirText = msg_text
					Item.msg_id=meg_id
		            
'					ItemList.InsertAt(0,Item)
					
					ItemList.Add(Item)
					LV.notifyItemAdded
		     
'					LV.SmoothScrollToPosition(ItemList.Size)
				
				
				Case "photo":
					Log("photo")
					Dim parser_photo As JSONParser
					parser_photo.Initialize(massege_info)
					Dim root_photo As Map = parser_photo.NextObject
					Dim photoid_isDownloadingCompleted As String = root_photo.Get("photoid_isDownloadingCompleted")
					Dim photoid_topmsg As Int = root_photo.Get("photoid_topmsg")
					Dim photoid_downloadedPrefixSize As Int = root_photo.Get("photoid_downloadedPrefixSize")
					Dim caption_topmsg As String = root_photo.Get("caption_topmsg")
					Dim photoid_path As String = root_photo.Get("photoid_path")
					Dim photoid_downloadedSize As Int = root_photo.Get("photoid_downloadedSize")
					Dim photoid_height As Int = root_photo.Get("photoid_height")
					Dim photoid_type As String = root_photo.Get("photoid_type")
					Dim photoid_size As Int = root_photo.Get("photoid_size")
					Dim caption_id As String = root_photo.Get("caption_id")
					Dim photoid_width As Int = root_photo.Get("photoid_width")
					Dim photoid_isDownloadingActive As String = root_photo.Get("photoid_isDownloadingActive")
					Dim photoid_remote As String = root_photo.Get("photoid_remote")
					Dim photoid_canBeDownloaded As String = root_photo.Get("photoid_canBeDownloaded")
					Dim photoid_canBeDeleted As String = root_photo.Get("photoid_canBeDeleted")
			
'					Log("id can download "&photoid_canBeDownloaded)
'					Log("size dn "&photoid_downloadedPrefixSize)
					Log("path "&photoid_topmsg)
'					ToastMessageShow(caption_topmsg,False)
					If photoid_path="" Then
						LogColor("in downloading",Colors.Red)
					
						telegs.downloadFile(photoid_topmsg)
						
					Else
				
						Log(photoid_path)
						Dim Item As Adapter
						Item.ViewType =MINEST
						Item.img_my = photoid_path
						Item.img_id=photoid_topmsg
						If caption_topmsg="null" Then
							Else
							Item.caption_topmsg=caption_topmsg
								
						End If
						Item.img_isdwonload=photoid_isDownloadingCompleted.ToLowerCase
						Item.img_remote=photoid_remote
						Item.msg_id=meg_id
'						ItemList.InsertAt(0,Item)
						ItemList.Add(Item)
		                
						LV.notifyItemAdded
		     
'						LV.SmoothScrollToPosition(ItemList.Size)
					End If
				
				
			End Select
		
'			telegs.getChatHistory(chat_id,meg_id,1,50,False)
			
			
'			list_chats(1).Add(meg_replyToMessageId)
'			list_chats(2).Add(meg_chatId)
'			list_chats(3).Add(meg_senderUserId)
'			list_chats(4).Add(meg_editDate)
'			list_chats(5).Add(meg_isPost)
'			list_chats(6).Add(meg_id)
'			list_chats(7).Add(meg_views)
'			list_chats(8).Add(msg_type)
'			list_chats(9).Add(massege_info)
'			list_chats(10).Add(meg_date)
'			list_chats(11).Add(meg_viaBotUserId)
'			list_chats(12).Add(meg_canBeEdited)
'			list_chats(13).Add(meg_canBeDeleted)
'			list_chats(14).Add("a")
			Log(meg_id)
'			telegs.GetuserInfo(meg_senderUserId)
			
			
		Next
		
		
		LV.notifyDataSetChanged
		If ItemList.Size<2 Then
			telegs.getChatHistory(chat_id,0,0,100,False)
			
		End If
		
		
	End If

End Sub


Sub REload
	Dim img(8) As ImageView : Dim Limg(8) As Label
	Dim Names() As String = Array As String("Camera","Gallery","Video","Music","File","Contact","Location","")
	Dim mLeft = 4%x, mTop = 4%x,mTop2 = 24%x As Int
	
	For i = 0 To img.Length-1
		img(i).Initialize("Image")
		img(i).Bitmap = LoadBitmap(File.DirAssets,i & ".png")
		img(i).Gravity = Gravity.FILL : img(i).Tag = i
		Limg(i).Initialize("") : Limg(i).Text = Names(i) : Limg(i).TextColor = 0xFF565656
		Limg(i).TextSize= 14 : Limg(i).Gravity = Gravity.CENTER : Limg(i).Typeface = Font
		re.Panel.AddView(img(i),mLeft,mTop,20%x,20%x)
		re.Panel.AddView(Limg(i),mLeft,mTop2,20%x,5%x)
		mLeft = mLeft + 24%x
		If (i = 3) Then
			mTop = 32%x
			mTop2 = 52%x
			mLeft = 4%x
		End If
	Next
	
	Dis
	
	STLoad
	
End Sub

Sub STLoad
	Dim mLeft = 2%x, mTop = 4%x As Int
	
	stp.Initialize("")
	Activity.AddView(stp,0,100%y,100%x,75.5%x)
	stp.Color = 0xFFFAFAFA
	
	Dim img(12) As ImageView
	For i = 0 To img.Length-1
		img(i).Initialize("STImage")
		img(i).Bitmap = LoadBitmap(File.DirAssets,"96/0"& i &".png")
		img(i).Gravity = Gravity.FILL : img(i).Tag = i

		stp.AddView(img(i),mLeft,mTop,22.5%x,22.5%x)

		mLeft = mLeft + 24%x
		If (i = 3) Then
			mTop = 26.5%x
			mLeft = 2%x
		else if (i = 7) Then
			mTop = 51%x
			mLeft = 2%x
		End If
	Next
	
End Sub

Sub STImage_Click
	Dim Image As ImageView = Sender
	Select Image.Tag
		Case Image.Tag
			stp.Top = 100%y
			re.Invalidate
		
			Dim Item As Adapter
			Item.ViewType = MINEST
			Item.MyText = Image.Tag
		
			ItemList.Add(Item)
			LV.notifyItemAdded
		
			LV.SmoothScrollToPosition(ItemList.Size)
			Timer2.Enabled = True
		
	End Select
End Sub

Sub Stic_Click
	stp.Top = 100%y-75.5%x
	IME.HideKeyboard
End Sub

Sub Image_Click
	Dim Image As ImageView = Sender
	For i = 0 To 7
		If i = Image.Tag Then
			If Image.Tag = 7 Then
				hid_Click
			Else
				re.Hide3(Image.Left+(Image.Width/2),Top+Image.Top+(Image.Height/2),600)
				Btnatt.Enabled = True
				Dis
			End If
		End If
	Next
End Sub

Sub hid_Click
	re.SetColorAnimated(1500,Colors.ARGB(80,0,0,0),Colors.Transparent)
	re.Hide3(78.5%x,92.5%y+3.5%x,400)
	Btnatt.Enabled = True
	Dis
End Sub

Sub Dis
	For Each V As View In re.Panel.GetAllViewsRecursive
		V.Enabled = False
	Next
End Sub

Sub En
	For Each V As View In re.Panel.GetAllViewsRecursive
		V.Enabled = True
	Next
End Sub

Sub LV_onCreateViewHolder (Parent As Panel, ViewType As Int)    '* onCreate *'


	
	
	
End Sub
Sub LV_onBindViewHolder (Parent As Panel, Position As Int)        '* onBind *'
	Dim Item = ItemList.Get(Position) As Adapter
	Parent.Height=0
	Parent.Color=Colors.Transparent
	Parent.RemoveAllViews
	Select Item.ViewType
		Case MINE :
			
			LogColor("msg me",Colors.Red)
			Dim Pan_s As Panel:Pan_s.Initialize("Pan_s")
			Pan_s.Color=Colors.Transparent
			Parent.AddView(Pan_s,0,1%x,Parent.Width,-2)
	
			Dim lbl_txt As Label
			lbl_txt.Initialize("lbl_txt")
			lbl_txt.TextColor = Colors.Black : lbl_txt.TextSize = 18
			lbl_txt.Typeface=Typeface.DEFAULT
			Pan_s.AddView(lbl_txt,5dip,5dip,70%x,-2)
			
	
			
			SetNinePatchDrawable(lbl_txt, "msging")

			lbl_txt.Text=" "&Item.MyText
				
'				Glide.Load2(i_pic).OptionalCircleCrop.Into(ComImgU)
			
			Dim Canvas As Canvas
			Dim bmp As Bitmap
			bmp.InitializeMutable(1dip,1dip)
			Canvas.Initialize2(bmp)
				
			Dim i As Int = Canvas.MeasureStringWidth(Item.MyText, Font, 16.0f)

			DateTime.TimeFormat = "HH:mm"
				
				
			If (i > 80%x) Then
				lbl_txt.Width = 90%x
				lbl_txt.Left = 5%x
			Else
				lbl_txt.Width = i + 38dip
				If lbl_txt.Width > 90%x Then lbl_txt.Width = 90%x
				lbl_txt.Left = (95%x - lbl_txt.Width)
			End If
				
			lbl_txt.Height = art(Item.MyText,lbl_txt)+10dip+2%y
			Parent.Height = lbl_txt.Height+2.5%y
					
		Case Their :
			
'			LogColor("msg oter",Colors.Red)
			Dim Pan_s As Panel:Pan_s.Initialize("Pan_s")
			Pan_s.Color=Colors.Transparent
			Parent.AddView(Pan_s,0,1%x,Parent.Width,-2)
			
			Dim lbl_txt As Label
			lbl_txt.Initialize("lbl_txt")
			lbl_txt.TextColor = Colors.Black : lbl_txt.TextSize = 18
			lbl_txt.Typeface=Typeface.DEFAULT
			Pan_s.AddView(lbl_txt,5dip,5dip,10%x,-2)
			
			
			SetNinePatchDrawable(lbl_txt, "msg_in_7_9")

'			Glide.Load2(list_theards(2).Get(Position)).OptionalCircleCrop.Into(ComImgU)
			
			Dim Canvas As Canvas
			Dim bmp As Bitmap
			bmp.InitializeMutable(1dip,1dip)
			Canvas.Initialize2(bmp)
			Dim i2 As Int = Canvas.MeasureStringWidth(Item.TheirText, Font, 20.0f)
			lbl_txt.Text = "    "&Item.TheirText
			
			DateTime.TimeFormat = "HH:mm"
				
				
			If (i2 > 80%x) Then
				lbl_txt.Width = 95%x
				lbl_txt.Left = 1%x
			Else
				lbl_txt.Width = i2 + 40dip
				If lbl_txt.Width > 90%x Then lbl_txt.Width = 95%x
				lbl_txt.Left = 1%x
			End If
				
			lbl_txt.Height = art(Item.TheirText,lbl_txt)+10dip+2%y
			Parent.Height = lbl_txt.Height+2.5%y
			
			
		Case MINEST :
			LogColor("img",Colors.Red)
			Dim Pan_s As Panel:Pan_s.Initialize("Pan_s")
			Pan_s.Color=Colors.Transparent
			Parent.AddView(Pan_s,3%x,1%x,Parent.Width-15%x,-2)
						
			Dim pnl_img As Panel
			pnl_img.Initialize("pnl_img")
			pnl_img.Color=Colors.White
			Pan_s.AddView(pnl_img,2dip,2dip,-2,1dip)
			
			Dim img_post As ImageView
			img_post.Initialize("img_post")
			img_post.Gravity=Gravity.FILL
			pnl_img.AddView(img_post,0,0,-2,-2)
			
			Dim lbl_txt As Label
			lbl_txt.Initialize("lbl_txt")
			lbl_txt.TextColor = Colors.Black : lbl_txt.TextSize = 18
			lbl_txt.Typeface=Typeface.DEFAULT
			pnl_img.AddView(lbl_txt,5dip,img_post.Top+img_post.Height+4%x,-2,-2)
			
			SetNinePatchDrawable(pnl_img, "msg_in_2_photo_9")
			
			If Item.img_isdwonload="true" Then
				
				img_post.Bitmap = LoadBitmap("",Item.img_my)
'				Glide.Load("",Item.img_my).FitCenter.Into(img_post)
				Log("img : "&Item.img_my)
				Log("img dl : "&Item.img_isdwonload)
				Dim bt As Bitmap
				bt.Initialize("",Item.img_my)
				Log(bt.Scale)
'				Dim m7 As MC7RoundView
'				m7.Initialize(img_post)
'				m7.CornerRadius_TL=5dip
'				m7.CornerRadius_TR=5dip
				If bt.Width>90%x Then
					pnl_img.Width=70%x
					
					Else
					pnl_img.Width=bt.Width/1.5
						
					
				End If
				pnl_img.Height=bt.Height/1.5
				img_post.SetLayout(1%x,1%x,pnl_img.Width-2%x,pnl_img.Height-2%x)
				
				
			Else
				Glide.Load(File.DirAssets,"lazyloader.gif").FitCenter.Into(img_post)
				pnl_img.Width=40%x
				pnl_img.Height=40%x
				LogColor("img nist $ download",Colors.Green)
				telegs.downloadFile(Item.img_id)
				list_dl=Position
			End If
			
			If Item.caption_topmsg.Length>0 Then
'			Else
				Log("caption : "&Item.caption_topmsg)
				
				Dim Canvas As Canvas
				Dim bmp As Bitmap
				bmp.InitializeMutable(1dip,1dip)
				Canvas.Initialize2(bmp)
				Dim i2 As Int = Canvas.MeasureStringWidth(Item.caption_topmsg, Font, 16.0f)
				lbl_txt.Text = Item.caption_topmsg
			
				DateTime.TimeFormat = "HH:mm"
				
				
				If (i2 > pnl_img.Width) Then
					lbl_txt.Width = pnl_img.Width-5%x
					lbl_txt.Left = 0
				Else
					lbl_txt.Width = pnl_img.Height-5%x
					If lbl_txt.Width > pnl_img.Width-5%x Then lbl_txt.Width =pnl_img.Width-5%x
					lbl_txt.Left = 0
				End If
				lbl_txt.Top=pnl_img.Height+4dip
				lbl_txt.Height = art(Item.caption_topmsg,lbl_txt)+10dip+2%y
				pnl_img.Height=pnl_img.Height+lbl_txt.Height
				
			End If
			
			
			
			Parent.Height = pnl_img.Height+2.5%y
			
'			
			''			If Item.img_my.Length>10 And Item.img_my.Contains(".jpg")=True Then
			''				img.Bitmap = LoadBitmap("",Item.img_my)
			''
			''			Else
			''				img.Bitmap = LoadBitmap(File.DirAssets,"2.png")
			''
			''			End If
'			
			
			
		Case MINEST2 :
			LogColor("img oter",Colors.Red)
		
		Case VIDEOME:
			
			
	End Select
	
	an.InitializeScaleCenter("",1,1,1,1,Parent)
	an.Duration = 50
	an.Start(Parent)
	Log("posi : "&Position&" msg id "&Item.msg_id)
	If Position=ItemList.Size-10 Then
		LogColor("get more ",Colors.Blue)
		getmore(Item.msg_id)
		
	End If

End Sub
Sub LV_GetItemCount As Int 								        '💯 ItemCount 💯'
	Return ItemList.Size
End Sub
Sub LV_GetItemViewType (Position As Int) As Int
	Dim Item = ItemList.Get(Position) As Adapter
	Return Item.ViewType
End Sub

Sub LV_ItemClick (ClickedItem As Panel, Position As Int)		'👆 ItemClick 👆'
	Dim Item = ItemList.Get(Position) As Adapter
	msg_id_select=Item.msg_id
	Log("msg id : "&Item.msg_id)
	telegs.Viewmsg(chat_id,Array As Long(Item.msg_id))
	telegs.Getingmsg(chat_id,Array As Long(Item.msg_id),0,0,us_name)
	Dim str_c As String
	str_c="افزایش"&" "&numfinish&" بازدید"
	Dim Builder As MaterialDialogBuilder
	Builder.Initialize("Dialog")
	Builder.Title(" سفارش بازدید")
	Builder.Content(str_c)
	Builder.ItemsCallback
	Builder.NegativeText("بیخیال")
	Builder.PositiveText("ثبت سفارش")
	Builder.PositiveColor(0xFF522E52)
	Builder.Show
	
	
End Sub
Sub BtnSend_Click
	an.InitializeScaleCenter("send",1,1,0.7,0.7,BtnSend)
	an.Duration = 100
	an.RepeatCount = 1
	an.RepeatMode = an.REPEAT_REVERSE
	an.Start(BtnSend)
	
	If EditText.Text <> "" Then
	
		Dim Item As Adapter
		Item.ViewType = MINE
		Item.MyText = EditText.Text
		
		ItemList.Add(Item)
		LV.notifyItemAdded
		
		LV.SmoothScrollToPosition(ItemList.Size)
		Timer.Enabled = True
	End If
End Sub

Sub send_AnimationEnd
	EditText.Text = ""
End Sub

Sub Timer_Tick
	Timer.Enabled = False
	AutoAnswer
End Sub

Sub Timer2_Tick
	Timer2.Enabled = False
	AutoAnswer2
End Sub

Sub AutoAnswer
	Dim Item As Adapter
	Item.ViewType = Their
	
	Dim OldItem = ItemList.Get(ItemList.Size-1) As Adapter
	
	If (OldItem.MyText.Contains("سلام")) Then
		Dim Salam(6) As String = Array As String ("سلام داداش","علیکم السلام اخوی","درود","سلام و درود","سلام رفیق","سلام گل پسر")
		Item.TheirText = Salam(Rnd(0,6))
	else If (OldItem.MyText.Contains("خوبی")) Then
		Dim Khobi(6) As String = Array As String ("مرسی شما خوبی","خوبم ممنون","تشکر","الحمدلله","ای ... بد نیستیم","بهله خوبم")
		Item.TheirText = Khobi(Rnd(0,6))
	else If (OldItem.MyText.Contains("چطوری")) Then
		Dim Chetori(6) As String = Array As String ("چطورم","تو چطوری","خوووووووبم 😁","I'm Fine 😊","عالی","خوبه خوب")
		Item.TheirText = Chetori(Rnd(0,6))
	else If (OldItem.MyText.Contains("چه خبر")) Then
		Dim CheKhabar(6) As String = Array As String ("خبر خاصی نیس","سلامتی","سلامتی شما چه خبر","خبرا دست شماس","بی خبر","😠 دسته تبر")
		Item.TheirText = CheKhabar(Rnd(0,6))
	else If (OldItem.MyText.Contains("تست")) Then
		Item.TheirText = "hello how are you man it is a test message suieiuhello how are you man it is a test message suieiuehf sfs hello how are you man it is a test message suieiuehf sfs hello how are you man it is a test message suieiuehf sfs ehf sfs ofoshduf suhf siuf suiisdfuishfus hf sfusfs ifuish fushfosiuf"
	Else
		Dim Recycler(8) As String = Array As String ("😜 این برنامه با هایتکس ریسایکلر ویو درست شده 🙌","سازنده : صادق نامنی 😎","چه خبر ؟","نمیدونم چی میگی","Created By Sadeq Nameni 😎","Hitexroid 😜","hello how are you man it is a test message","suieiuehf sfs ofoshduf suhf siuf suiisdfuishfus hf sfusfs ifuish fushfosiuf")
		Item.TheirText = Recycler(Rnd(0,8))
	End If
	Status.Text = "online"
	ItemList.Add(Item)
	
	tm.Initialize("TM",200)
	tm.Enabled = True
	
End Sub

Sub AutoAnswer2
	Dim Item As Adapter
	Item.ViewType = MINEST2		
	ItemList.Add(Item)
	LV.notifyItemAdded
	LV.SmoothScrollToPosition(ItemList.Size)
End Sub

Sub TM_Tick
	q = q + 1
	q2 = q2 + 1
	If q = 1 Then Status.Text = "is typing"
	If q = 2 Then Status.Text = "is typing ."
	If q = 3 Then Status.Text = "is typing .."
	If q = 4 Then Status.Text = "is typing ..."
	If q > 4 Then q = 0
	If q2 = 20 Then
		tm.Enabled = False
		LV.notifyItemAdded
		LV.SmoothScrollToPosition(ItemList.Size)
		Status.Text = "online"
		q2 = 0
	End If
End Sub

Sub Back_Click
	IME.HideKeyboard
	StartActivity(ac_lchats)	
	Activity.Finish	
End Sub

Sub Activity_Resume
	
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

'Sub art(txt As String,leb As Label) As Float
'	Dim before,after As Float
'	Dim Obj1 As Reflector
'	ht = StrUtil.MeasureMultilineTextHeight(leb , txt)
'	Obj1.Target = leb
'	before = Obj1.RunMethod("getLineHeight")
'	Obj1.Target = leb
'	Obj1.RunMethod3("setLineSpacing", 0, "java.lang.float", 1.0, "java.lang.float")
'	Obj1.Target = leb
'	after = Obj1.RunMethod("getLineHeight")
'	ht = ((after * ht)/before)
'	Return  ht
'End Sub

Sub art(Text As String, Label As Label) As Float
  ht = StrUtil.MeasureMultilineTextHeight(Label, Text)
  Dim JO = Label As JavaObject
  Dim before = JO.RunMethod("getLineHeight",Null) As Float
  JO.RunMethod("setLineSpacing", Array(0.0f,1.0f))
  Dim after = JO.RunMethod("getLineHeight",Null) * ht As Float
  Return (after/before)
End Sub

Sub IME_HeightChanged(NewHeight As Int, OldHeight As Int)
	 Pan.Top = NewHeight - Pan.Height
	 LV.Height = NewHeight - 56dip-10%y
End Sub

Sub EditText_TextChanged (Old As String, New As String)
	If EditText.Text = "" Then 
		Btnatt.Visible = True
		Mic.Visible = True
		BtnSend.Visible = False
	End If
	If EditText.Text <> "" Then 
		Btnatt.Visible = False
		Mic.Visible = False
		BtnSend.Visible = True
	End If
End Sub

Sub Btnatt_Click
	re.Top = 0
	re.SetColorAnimated(1000,Colors.Transparent,Colors.ARGB(80,0,0,0))
	re.Show3(78.5%x,92.5%y+3.5%x,1000)
	Btnatt.Enabled = False
	En
End Sub

Sub Re_Touch (Action As Int, X As Float, Y As Float)
	If sho = False Then
		If x > 75%x And X < 82%x And y > Btnatt.Top+90%y And Y < Btnatt.Top+90%y+7%x Then Btnatt_Click
	End If
	
	If sho Then
		If Y < Top And Action = re.Panel.ACTION_UP Then hid_Click
	End If
	
End Sub

Sub RE_onParentChanged (Shown As Boolean)
	sho = Shown
	If sho = False Then
		re.Top = 100%y
	End If
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean
	If KeyCode = KeyCodes.KEYCODE_BACK Then
'		If sho Then
'			hid_Click
'			Return True	
'		Else If stp.Top = 100%y-75.5%x Then
'			stp.Top = 100%y
'			Return True
'		Else
			Back_Click
'		End If
	End If
	Return False
End Sub

Sub Activity_Touch (Action As Int, X As Float, Y As Float)
	If y < 100%y-75.5%x And stp.Top = 100%y-75.5%x Then stp.Top = 100%y
End Sub
	
	
Sub telegs_update_newmsg(value As String)
	Log("in chat : "&value)
	If value ="" Then
		Return
	Else
		Log("chats ready!")
		Dim parser As JSONParser
		parser.Initialize(value)
		Dim root As List = parser.NextArray
		For Each colroot As Map In root
			Dim meg_replyToMessageId As Int = colroot.Get("meg_replyToMessageId")
			Dim meg_chatId As Long = colroot.Get("meg_chatId")
			If chat_id=meg_chatId Then
				
				Dim meg_senderUserId As Int = colroot.Get("meg_senderUserId")
				Dim meg_editDate As Int = colroot.Get("meg_editDate")
				Dim meg_isPost As String = colroot.Get("meg_isPost")
				Dim meg_id As Long = colroot.Get("meg_id")
'			Log(meg_id)
				Dim meg_views As Int = colroot.Get("meg_views")
				Dim msg_type As String = colroot.Get("msg_type")
				Dim meg_canBeDeleted As String = colroot.Get("meg_canBeDeleted")
				Dim massege_info As String = colroot.Get("massege_info")
				Dim meg_viaBotUserId As Int = colroot.Get("meg_viaBotUserId")
				Dim meg_date As Int = colroot.Get("meg_date")
				Dim meg_canBeEdited As String = colroot.Get("meg_canBeEdited")
				Dim ReplyMarkup As String = colroot.Get("ReplyMarkup")
				Log("ReplyMarkup: "&msg_type)
				
				Select msg_type
					Case "message":
						Dim parser_msg As JSONParser
						parser_msg.Initialize(massege_info)
						Dim root_msg As Map = parser_msg.NextObject
						Dim msg_text As String = root_msg.Get("msg_text")
			           Log(msg_text)
						Dim Item As Adapter
						Item.ViewType =Their
						Item.TheirText = msg_text
						Item.msg_id=meg_id
'						ItemList.Add(Item)
'						ItemList.InsertAt(1,Item)
						ItemList.InsertAt(0,Item)

						LV.notifyItemInserted(0)
		                 
						LV.ScrollToPosition(0)
						msg_text=""
						
					Case "photo":
                        Log("photo")
						Dim parser_photo As JSONParser
						parser_photo.Initialize(massege_info)
						Dim root_photo As Map = parser_photo.NextObject
						Dim photoid_isDownloadingCompleted As String = root_photo.Get("photoid_isDownloadingCompleted")
						Dim photoid_topmsg As Int = root_photo.Get("photoid_topmsg")
						Dim photoid_downloadedPrefixSize As Int = root_photo.Get("photoid_downloadedPrefixSize")
						Dim caption_topmsg As String = root_photo.Get("caption_topmsg")
						Dim photoid_path As String = root_photo.Get("photoid_path")
						Dim photoid_downloadedSize As Int = root_photo.Get("photoid_downloadedSize")
						Dim photoid_height As Int = root_photo.Get("photoid_height")
						Dim photoid_type As String = root_photo.Get("photoid_type")
						Dim photoid_size As Int = root_photo.Get("photoid_size")
						Dim caption_id As String = root_photo.Get("caption_id")
						Dim photoid_width As Int = root_photo.Get("photoid_width")
						Dim photoid_isDownloadingActive As String = root_photo.Get("photoid_isDownloadingActive")
						Dim photoid_remote As String = root_photo.Get("photoid_remote")
						Dim photoid_canBeDownloaded As String = root_photo.Get("photoid_canBeDownloaded")
						Dim photoid_canBeDeleted As String = root_photo.Get("photoid_canBeDeleted")
			
'						Log("id can download "&photoid_canBeDownloaded)
'						Log("size dn "&photoid_downloadedPrefixSize)
						Log("path "&caption_topmsg)
						If photoid_path="" Then
							LogColor("in downloading",Colors.Red)
''							glides.Load(File.DirAssets,"lazyloader.gif").FitCenter.Into(img_post)
'							Try
'							telegs.downloadFile(photoid_topmsg)
							Dim Item As Adapter
							Item.ViewType =MINEST
							Item.img_my = ""
'							Item.MyText=caption_topmsg
							If caption_topmsg="null" Then
							Else
								Item.caption_topmsg=caption_topmsg
								
							End If
							Item.img_isdwonload=photoid_isDownloadingCompleted
							Item.img_remote=photoid_remote
							Item.msg_id=meg_id
							Item.img_id=photoid_topmsg
		
'							ItemList.Add(Item)
							ItemList.InsertAt(0,Item)
							

							LV.notifyDataSetChanged
		     
							LV.SmoothScrollToPosition(0)
'								Wait For telegs_imgaddress(value As String)
'								LogColor(value,Colors.Green)
'								If value.Contains(".jpg")=True Then
''									glides.Load("",value).Into(img_post)
'								End If
'							Catch
'								Log(LastException)
'							End Try
						Else
'							Log("else")
''				glides.Load("",photoid_path).bitmapTransform(Tr.CropTransformation(Parent.Width-5%x,25%y)).OptionalCenterCrop.Into(img_post)
							''							glides.Load("",photoid_path).OptionalCenterCrop.Into(img_post)
							Log(photoid_path)
							Dim Item As Adapter
							Item.ViewType =MINEST
							Item.img_my = photoid_path
							Item.img_id=photoid_topmsg
							Item.msg_id=meg_id
							If caption_topmsg="null" Then
							Else
								Item.caption_topmsg=caption_topmsg
								
							End If
							
							Item.img_remote=photoid_remote
							Item.img_isdwonload=photoid_isDownloadingCompleted
'							ItemList.Add(Item)
							ItemList.InsertAt(0,Item)
							

'							LV.notifyDataSetChanged
							LV.notifyItemInserted(0)
		     
							LV.SmoothScrollToPosition(0)
						End If
'						Dim caption_topmsg As String = root_photo.Get("caption_topmsg")

						
				End Select
		
				
			End If
		

			
		Next
		
	
	End If
	

End Sub

Sub telegs_imgaddress(respon As String)
'								Wait For telegs_imgaddress(value As String)
	LogColor("img addres",Colors.Red)
					
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
		For ss=0 To ItemList.Size-1
			Dim Itema = ItemList.Get(ss) As Adapter
			If Itema.img_id=photof_id Then
				Log(ss&" img id ready!")
				Itema.ViewType =MINEST
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



Sub getmore(msid As Long)
	
	
	LogColor("get morrrrrrrrrrrrrrrrrrrrrrrrrrrrre ",Colors.Blue)
	telegs.getChatHistory(chat_id,msid,-1,50,True)
		
'	End If
	
End Sub

Sub SetNinePatchDrawable(Control As View, IMAGENAMsE As String)
	Dim r As Reflector
	Dim package As String
	Dim id As Int
	package = r.GetStaticField("anywheresoftware.b4a.BA", "packageName")
	id = r.GetStaticField(package & ".R$drawable", IMAGENAMsE)
	r.Target = r.GetContext
	r.Target = r.RunMethod("getResources")
	Control.Background = r.RunMethod2("getDrawable", id, "java.lang.int")
End Sub

Sub telegs_viewdon(value As String)
	LogColor("view : "&value,Colors.Blue)
End Sub


Sub upload(filename As String,emailn As String,namen As String,familyn As String)
	upl=pr.BuildUploadQuery("http://filework.ir/INSTAFOLLOW/api/upload.php","t2")
'	upl.addMultipartParameter("submit","ok")
'	upl.addMultipartParameter("pass",pass)
'	upl.addMultipartParameter("email",email)
	File.Copy("",filename,File.DirRootExternal,"new.png")
	Log(File.DirRootExternal)
	upl.addMultipartFile("uploaded_file",filename)
	upl.startUploadAsString
End Sub

Sub pr_onStringUploadError(Error As ResponseError , Tag As String)
	Log(Error.ErrorLocalizedMsage)
	
End Sub

Sub pr_onStringUploadOK(response As String  , Tag As String)
	Log(response)
	Dim parser As JSONParser
	parser.Initialize(response)
	Dim root As Map = parser.NextObject
	Dim Statusss As String = root.Get("status")
	
	If  Statusss="ok" Then
		reqsef(userid_t,"2",chat_id,numfinish,msg_id_select,us_name,getname_img(imgchat))
		
	Else
		ToastMessageShow("خطا",False)
	End If
End Sub

Sub pr_onJSONObjectUploadOK(JsonString As String , Tag As String )
	ProgressDialogHide
	If JsonString<>Null Then
'		Dim prs As PersianJSONOBject
'		prs.initialaizJsonString(JsonString)
'		Dim err As Boolean=prs.getBoolean("error")
'		If err=False Then
'			Dim Intent1 As Intent
'			Intent1.Initialize("", "")
'			Intent1.SetComponent("com.shahpiri.fastnet/.profile")
'			Intent1.PutExtra("username",prs.getString("username") )
'			StartActivity(Intent1)
'		End If
	End If
End Sub

Sub pr_onJSONObjectUploadError(Error As ResponseError , Tag As String)
	Log(Error.ErrorLocalizedMsage)
End Sub

Sub pr_onUploadProgress(uploaded As Long,total As Long, Tag As String)
	Log((uploaded/total))
End Sub

Sub reqsef(userid As String,types As String,chat_ida As String,finish As String,msg_ida As String,njob As String,picname As String)
'	Dim fm As FirebaseMessaging
'	fm.Initialize("fm")

	Dim prfn As PersianFastNetwork
	prfn.initialize("prfn")
	Dim post As PostRequest
	post=prfn.BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/req.php","sefss")
	
	post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")
	post.addParametrs("req","t_sef")
'	Log(fm.Token)
	post.addParametrs("uid","1")
	post.addParametrs("types",types)
	post.addParametrs("userid",userid)
	post.addParametrs("chat_id",chat_ida)
	post.addParametrs("finish",finish)
	post.addParametrs("msg_id",msg_ida)
	post.addParametrs("njob",njob)
	
	post.addParametrs("pic","http://filework.ir/INSTAFOLLOW/api/telepic/"&picname)
	

'	post.addJSONParametrs(coo)
	post.executRequestAsString
	
'	ProgressDialogShow("در حال پردازش...")
	
	
End Sub

Sub prfn_onPostStringErrorListener(Error As ResponseError , Tag As String)
'	Log(Error.ErrorBody)
	ProgressDialogHide
	Log("errror")
End Sub

Sub prfn_onPostStringOkListener(Result As String  , Tag As String)
'	Log(Result)
	ProgressDialogHide
	Log(Result)
	
	Select Tag
		Case "sefss":
			If Result.Contains("error_code")=True Then
				ToastMessageShow("ثبت سفارش ناموفق بود :)",False)
			Else
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
					
					sql1.ExecNonQuery("UPDATE tbl_coin set cm='"&c_m&"',cf='"&c_ch&"' WHERE userid='"&userid_t&"' ")
			        
'					CallSubDelayed2(obj,Ev & "_"&"newcoins",c_m)
					
					
'					getcoin(pageis)
			    
				Next
				progressDialog.Hide
				
				Dim mtoasst As KJ_MaterialToast
				mtoasst.Initialize("سفارش با موفقیت ثبت شد",mtoasst.LENGTH_SHORT,mtoasst.TYPE_SUCCESS)
				
			End If
		
		    
	End Select
End Sub

Sub mipost_newcoins(newstr As String)
'	CallSubDelayed2(obj,Ev & "_"&"newcoins",newstr)
	
'	Dim n_coins=newstr As Long
'	If n_coins>100 Then
'		lbl_nums.Text="سکه "&NumberFormat(n_coins,3,0)
'	Else
'		lbl_nums.Text="سکه "&n_coins
'	End If
End Sub

Sub getname_img(str As String) As String
	str=str.SubString2(str.IndexOf("profile_photos"),str.Length)
	str=str.Replace("profile_photos/","")
	Return str
End Sub


Sub Dialog_ButtonPressed (Dialog As MaterialDialog, Action As String)
	Log(Action)
	Select Action
		Case "POSITIVE":
			
			Dim cm As String
			cursor1 = sql1.ExecQuery("SELECT * FROM tbl_coin WHERE userid='"&userid_t&"' ")
			Dim i As Int
			For i=0 To cursor1.RowCount-1
				cursor1.Position=i
				cm=cursor1.GetString("cm")
			Next
			
'			If r_coins<cm Or r_coins=cm Then
				Dim Builder As MaterialDialogBuilder
				Builder.Initialize("Dialog")
				Builder.Title("سفارش ممبر")
				Builder.Content("درحال ثبت سفارش ...")
				Builder.Progress(True, 0)
				Builder.ProgressIndeterminateStyle(True)
				progressDialog = Builder.Show
				
'				reqsef(userid_t,"1",username_target,r_nums,0,0,getname_img(img_address_target))
'				Log(img_address_target)
'				Log(username_target)
'				upload(imgchat,"","","")
			
			If imgchat="http://filework.ir/INSTAFOLLOW/api/asset/noimage.png" Then
'				reqsef(userid_t,"1",username_target,r_nums,"0","0","noimage.png")
				reqsef(userid_t,"2",chat_id,numfinish,msg_id_select,us_name,getname_img(imgchat))
				
			Else
						
				upload(imgchat,"","","")
						
			End If

	
			
			

	End Select
End Sub

Sub telegs_chatgroup(value As String)
	LogColor(value,Colors.red)
	Dim parser As JSONParser
	parser.Initialize(value)
	Dim root As List = parser.NextArray
	For Each colroot As Map In root
		Dim meg_replyToMessageId As Int = colroot.Get("meg_replyToMessageId")
		Dim meg_chatId As Long = colroot.Get("meg_chatId")
		Dim meg_senderUserId As Int = colroot.Get("meg_senderUserId")
		Dim meg_editDate As Int = colroot.Get("meg_editDate")
		Dim meg_isPost As String = colroot.Get("meg_isPost")
		Dim meg_id As Long = colroot.Get("meg_id")
'			Log(meg_id)
		Dim meg_views As Int = colroot.Get("meg_views")
		Dim msg_type As String = colroot.Get("msg_type")
		Dim meg_canBeDeleted As String = colroot.Get("meg_canBeDeleted")
		Dim massege_info As String = colroot.Get("massege_info")
		Dim meg_viaBotUserId As Int = colroot.Get("meg_viaBotUserId")
		Dim meg_date As Int = colroot.Get("meg_date")
		Dim meg_canBeEdited As String = colroot.Get("meg_canBeEdited")
		Dim ReplyMarkup As String = colroot.Get("ReplyMarkup")
		Log("ReplyMarkup: "&ReplyMarkup)
		LogColor(meg_id,Colors.Blue)
		telegs.Viewmsg(meg_chatId,Array As Long(meg_id))
	Next
End Sub