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
	Private pnl_tolbar As Panel
	Private LV As Hitex_LayoutView
	Private Glide As Hitex_Glide
	Private prfn As PersianFastNetwork
	Private i_username ,i_pk,i_cookie,i_pic As String
	Private pnl_main As Panel
	
	Public Type_sef As Int
	Private LV As Hitex_LayoutView
	Private Glide As Hitex_Glide
	Private roundview As MC7RoundView
	Private pnl_posts As Panel
	
	Private upl As UploadRequest
	Dim pr As PersianFastNetwork
	
	Private list_f(40),list_l(40),list_v(40),list_c(40) As List
	Dim str_name,cm As String
	Dim r_coins,r_nums As Long
	Private progressDialog As MaterialDialog
	Dim pnl_coms As Panel
	Dim username_t ,userid_t As String
	
	Dim img_address_target As String
	Dim username_target As String
	Dim chatid_target,idchannel_t,titelchat_target  As String
    Dim us_name As String 
End Sub

'Initializes the object. You can add parameters to this method if needed.

Public Sub Initialize(EventName As String,Module As Object)
	Ev = EventName
	obj = Module
	pr.initialize("pr")

	
	For ia=0 To 38
		
		list_f(ia).Initialize
		list_l(ia).Initialize
		list_v(ia).Initialize
		list_c(ia).Initialize
		
	Next
	
	'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''database
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
	
	Log("username : "&userid_t)
	
End Sub

Sub addpnl(pnl As Panel) As View
	For ia=0 To 38
		
		list_f(ia).Initialize
		list_l(ia).Initialize
		list_v(ia).Initialize
		list_c(ia).Initialize
		
	Next
	Select Type_sef
		
		Case 0:
			list_f(1).AddAll(Array As String("50","100","200","300","400","500","600","700","800","900","1000","2000"))
			list_f(2).AddAll(Array As String("100","200","300","600","800","1000","1200","1400","1600","1800","2000","4000"))
			
		Case 1:
			list_l(1).AddAll(Array As String("50","100","200","300","400","500","600","700","800","900","1000","2000"))
			list_l(2).AddAll(Array As String("100","200","300","600","800","1000","1200","1400","1600","1800","2000","4000"))
			
		Case 2:
			list_c(1).AddAll(Array As String("50","100","200","300","400","500","600","700","800","900","1000","2000"))
			list_c(2).AddAll(Array As String("100","200","300","600","800","1000","1200","1400","1600","1800","2000","4000"))
			
		Case 3:
			list_v(1).AddAll(Array As String("50","100","200","300","400","500","600","700","800","900","1000","2000"))
			list_v(2).AddAll(Array As String("100","200","300","600","800","1000","1200","1400","1600","1800","2000","4000"))
			
		Case 4:
			list_f(1).AddAll(Array As String("50","100","200","300","400","500","600","700","800","900","1000","2000"))
			list_f(2).AddAll(Array As String("100","200","300","600","800","1000","1200","1400","1600","1800","2000","4000"))
			
	End Select
	


	pnl_main.Initialize("pnl_main")
	pnl_main.Color=Colors.White
	pnl.AddView(pnl_main,0,0,pnl.Width,pnl.Height)
	
	LV.Initializer("LV").ListView.Build
	pnl_main.AddView(LV,0,0,pnl_main.Width,pnl_main.Height)
'	LV.Ripple.Color(0xFF5E23DE).Alpha(0.2f).Duration(350)
'	LV.CardView.CardElevation(4dip).Radius(20dip)
'	LV.Divider.Add1(Colors.Transparent,2%x)
	LV.Show
	
End Sub


Sub LV_onCreateViewHolder (Parent As Panel, ViewType As Int)      '# onCreate #'
	
End Sub

Sub LV_onBindViewHolder (Parent As Panel, Position As Int)         '* onBind *'
	Parent.RemoveAllViews
	Parent.Color=Colors.Transparent
	
	Dim bkcolors As ColorDrawable
	bkcolors.Initialize(Colors.White,5%x)
	
	Dim cards As CardView
	cards.Initialize("cards")
	cards.Color=Colors.White
	cards.CornerRadius=8%x
	cards.Elevation=3%x
	Parent.AddView(cards,5%x,5%x,Parent.Width-10%x,10%x)
	
	Dim pnl_card As Panel
	pnl_card.Initialize("pnl_card")
	pnl_card.Color=Colors.White
	cards.AddView(pnl_card,0,0,cards.Width,cards.Height)
	
	
	Dim lbl_itemicon As Label
	lbl_itemicon.Initialize("lbl_itemicon")
	lbl_itemicon.TextColor=0xFFD305BA
	lbl_itemicon.TextSize=25
	lbl_itemicon.Typeface=Typeface.MATERIALICONS
	lbl_itemicon.Gravity=Gravity.CENTER_VERTICAL+Gravity.CENTER_HORIZONTAL
	pnl_card.AddView(lbl_itemicon,pnl_card.Width-15%x,3%x,10%x,10%x)
	
	Dim lbl_name As Label
	lbl_name.Initialize("lbl_name")
	lbl_name.TextColor=Colors.DarkGray
	lbl_name.TextSize=13
	lbl_name.Typeface=Typeface.LoadFromAssets("iran_sans.ttf")
	lbl_name.Gravity=Gravity.CENTER_VERTICAL+Gravity.RIGHT
	pnl_card.AddView(lbl_name,0,3.5%x,pnl_card.Width-17%x,10%x)
	
	Dim bkcolor As ColorDrawable
	bkcolor.Initialize(0xFFFFD82B,10)
	Dim lbl_notis As Label
	lbl_notis.Initialize("lbl_notis")
	lbl_notis.TextColor=Colors.DarkGray
	lbl_notis.TextSize=13
	lbl_notis.Typeface=Typeface.LoadFromAssets("iran_sans.ttf")
'	lbl_notis.Text="500 سکه"
	lbl_notis.Gravity=Gravity.CENTER_VERTICAL+Gravity.CENTER_HORIZONTAL
'	lbl_notis.Background=bkcolor
	pnl_card.AddView(lbl_notis,2%x,4%x,30%x,8%x)
	
	cards.Height=lbl_name.Top+lbl_name.Height+2%x
	pnl_card.Height=lbl_name.Top+lbl_name.Height+2%x
	
'	lbl_name.Text=" افزایش 50 فالو"

'	lbl_itemicon.Text=Chr(0xE8D3)
	
	roundview.Initialize(lbl_notis)
	roundview.CornerRadius_BL=8%x
	roundview.CornerRadius_BR=8%x
	roundview.CornerRadius_TL=8%x
	roundview.CornerRadius_TR=8%x
	roundview.BackgroundColor=0xFFFFD82B
	
	
'	Dim lbl_itemicon = Parent.GetView(0) As Label
'	Dim lbl_name = Parent.GetView(1) As Label
'	Dim lbl_notis = Parent.GetView(2) As Label
	Select Type_sef
		
		Case 0:
			lbl_name.Text="افزایش"&" "&list_f(1).Get(Position)&" ممبر"
			lbl_notis.Text=list_f(2).Get(Position)&" "&"سکه"
			lbl_itemicon.Text=Chr(0xE8D3)
		Case 1:
			lbl_name.Text="افزایش"&" "&list_l(1).Get(Position)&" لایک"
			lbl_notis.Text=list_l(2).Get(Position)&" "&"سکه"
		Case 2:
			lbl_name.Text="افزایش"&" "&list_c(1).Get(Position)&" کامنت"
			lbl_notis.Text=list_c(2).Get(Position)&" "&"سکه"
		Case 3:
			lbl_name.Text="افزایش"&" "&list_v(1).Get(Position)&" ویو"
			lbl_notis.Text=list_v(2).Get(Position)&" "&"سکه"
			
			lbl_itemicon.Text=Chr(0xE417)
		Case 4:
			
	End Select

	Parent.Height=cards.Top+cards.Height+5%x
End Sub

Sub LV_GetItemCount As Int 								        '$ ItemCount $'
	Select Type_sef
		
		Case 0:
			Return list_f(1).Size
		Case 1:
			Return list_l(1).Size
			
		Case 2:
			Return list_c(1).Size
			
		Case 3:
			Return list_v(1).Size
			
		Case 4:
			
	End Select
End Sub

Sub LV_ItemClick (ClickedItem As Panel, Position As Int)		'👆 ItemClick 👆'
    
	Select Type_sef
		
		Case 0:
			r_coins=list_f(2).Get(Position)
			r_nums=list_f(1).Get(Position)
			cursor1 = sql1.ExecQuery("SELECT * FROM tbl_coin WHERE userid='"&userid_t&"' ")
			Dim i As Int
			For i=0 To cursor1.RowCount-1
				cursor1.Position=i
				cm=cursor1.GetString("cm")
			Next
			cursor1.Close
			If r_coins<cm Or r_coins=cm Then
				
			Else
				Dim mtoasst As KJ_MaterialToast
				mtoasst.Initialize("سکه شما جهت سفارش این مقدار کافی نمیباشد",mtoasst.LENGTH_SHORT,mtoasst.TYPE_WARNING)
				Return
			End If
			
			Dim str_c As String
			str_c="افزایش"&" "&list_f(1).Get(Position)&" ممبر"
			Dim Builder As MaterialDialogBuilder
			Builder.Initialize("Dialog")
			Builder.Title(" سفارش ممبر")
			Builder.Content(str_c)
			Builder.ItemsCallback
			Builder.NegativeText("بیخیال")
			Builder.PositiveText("ثبت سفارش")
			Builder.PositiveColor(0xFF522E52)
			Builder.Show
			


		Case 3:  'view
			
			r_coins=list_v(2).Get(Position)
			r_nums=list_v(1).Get(Position)
			cursor1 = sql1.ExecQuery("SELECT * FROM tbl_coin WHERE userid='"&userid_t&"' ")
			Dim i As Int
			For i=0 To cursor1.RowCount-1
				cursor1.Position=i
				cm=cursor1.GetString("cm")
			Next
			cursor1.Close
			If r_coins<cm Or r_coins=cm Then
				
			Else
				Dim mtoasst As KJ_MaterialToast
				mtoasst.Initialize("سکه شما جهت سفارش این مقدار کافی نمیباشد",mtoasst.LENGTH_SHORT,mtoasst.TYPE_WARNING)
				Return
			End If
'			ToastMessageShow("userchannel :"&us_name,False)
			
			Act_Chat.chat_id=username_target
			Act_Chat.name_chat=titelchat_target
			Act_Chat.numcoins=r_coins
			Act_Chat.numfinish=r_nums
			Act_Chat.channelid=idchannel_t
			Act_Chat.imgchat=img_address_target
			Act_Chat.us_name=us_name
			StartActivity(Act_Chat)
			

		Case 2: 'comment
			
		Case 1:  
			
			
		Case 4:
			
	End Select
	
End Sub


Sub Dialog_ButtonPressed (Dialog As MaterialDialog, Action As String)
	Log(Action)
	Select Action
		Case "POSITIVE":
			
			
			cursor1 = sql1.ExecQuery("SELECT * FROM tbl_coin WHERE userid='"&userid_t&"' ")
			Dim i As Int
			For i=0 To cursor1.RowCount-1
				cursor1.Position=i
				cm=cursor1.GetString("cm")
			Next
			
			If r_coins<cm Or r_coins=cm Then
				Dim Builder As MaterialDialogBuilder
				Builder.Initialize("Dialog")
				Builder.Title("سفارش ممبر")
				Builder.Content("درحال ثبت سفارش ...")
				Builder.Progress(True, 0)
				Builder.ProgressIndeterminateStyle(True)
				progressDialog = Builder.Show
				
'				reqsef(userid_t,"1",username_target,r_nums,0,0,getname_img(img_address_target))
                Log(img_address_target)
				Log(username_target)
				If img_address_target="http://filework.ir/INSTAFOLLOW/api/asset/noimage.png" Then
					reqsef(userid_t,"1",username_target,r_nums,"0","0","noimage.png")
					Else
						
					upload(img_address_target,"","","")
						
				End If
				
			Else
				Dim mtoasst As KJ_MaterialToast
				mtoasst.Initialize("سکه شما جهت سفارش این مقدار کافی نمیباشد",mtoasst.LENGTH_SHORT,mtoasst.TYPE_WARNING)
				Return
			End If

	
			
			

	End Select
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
	Dim status As String = root.Get("status")
	
	If  status="ok" Then
		reqsef(userid_t,"1",username_target,r_nums,"0","0",getname_img(img_address_target))
		
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
			        
					CallSubDelayed2(obj,Ev & "_"&"newcoins",c_m)
					
					
'					getcoin(pageis)
			    
				Next
				progressDialog.Hide
				
				Dim mtoasst As KJ_MaterialToast
				mtoasst.Initialize("سفارش با موفقیت ثبت شد",mtoasst.LENGTH_SHORT,mtoasst.TYPE_SUCCESS)
				
			End If
		
		    
	End Select
End Sub

Sub mipost_newcoins(newstr As String)
	CallSubDelayed2(obj,Ev & "_"&"newcoins",newstr)
	
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