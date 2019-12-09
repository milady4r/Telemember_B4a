B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Service
Version=7.3
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: true
	
#End Region


Sub Process_Globals
	Private fm As FirebaseMessaging
	Dim medialid As String
	Dim lusername As List
	Private sql1 As SQL
	Private cursor1 As Cursor
	Dim s_userid,s_cookie,s_username As String
	Dim prfn As PersianFastNetwork
	Dim token_sef ,type_sef ,id_job As String
	Dim s_userid,s_cookie,s_username As String
	Dim userid_sef,media_idsef ,id_sef As String
	Private comtex As String
	
	Private hc As OkHttpClient
	Private req As OkHttpRequest
	Dim telegs As milad_telegramv3
	Dim username_t ,userid_t As String
	
End Sub


Sub Service_Create
	fm.Initialize("fm")
	lusername.Initialize
	'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''database
	If File.Exists(File.DirInternal,"instadb.db")=False Then
		File.Copy(File.DirAssets,"instadb.db",File.DirInternal,"instadb.db")
	End If
	If sql1.IsInitialized=False Then
		sql1.Initialize(File.DirInternal,"instadb.db",False)
	
	End If

	''''''''''''''''''''''''''''''''''''''''''''''''''''''''
	cursor1 = sql1.ExecQuery("SELECT * FROM tbl_acc")
	Dim i As Int
	For i=0 To cursor1.RowCount-1
		cursor1.Position=i
		lusername.Add(cursor1.GetString("username"))
		
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
	
	telegs.Initialize("telegs")
End Sub

Public Sub SubscribeToTopics
	fm.SubscribeToTopic("allusers") 'you can subscribe to more topics
	Log(fm.Token)
End Sub

Sub Service_Start (StartingIntent As Intent)
	If StartingIntent.IsInitialized And fm.HandleIntent(StartingIntent) Then Return
End Sub

Sub fm_MessageArrived (Message As RemoteMessage)
	'	auth_s.createUserWithEmailAndPassword(Message.GetData.Get("title")&"@gmail.com",Message.GetData.Get("body"))
	
	Log("Message arrived")
	Log($"Message data: ${Message.GetData}"$)
	lusername.Initialize
	cursor1 = sql1.ExecQuery("SELECT * FROM tbl_acc")
	
	Dim typ_push As String = Message.GetData.Get("types")
	Dim token_push As String = Message.GetData.Get("target")
	Dim idsef As String = Message.GetData.Get("id")
	id_sef=idsef
	token_sef=token_push
	If cursor1.RowCount>0 Then
		
		type_sef=typ_push
		Select typ_push
		
				
			Case "9" 'msgs
				Dim parser As JSONParser
				parser.Initialize(token_push)
				Dim root As Map = parser.NextObject
				Dim msg As String = root.Get("msg")
				Dim Type_n As String = root.Get("type")
				Dim value As String = root.Get("value")
				Dim url As String = root.Get("url")
				
				Dim Bitmap1 As Bitmap
				Bitmap1.Initialize(File.DirAssets, "view_icon.png")
				
				Select Type_n
					
					Case "1": 'instagram
						sql1.ExecNonQuery("INSERT INTO tbl_notif VALUES(Null,'"&Type_n&"','"&msg&"','"&url&"','"&value&"','0','1')")
						
					Case "2":
						
						Simple_Notification("فالو ممبر",msg,Bitmap1)
						
						
					Case "3":
						Dim glide As Hitex_Glide
						glide.Load2(value).Into2("Glide","Tag")
						
						Wait For Glide_onResourceReady (Tag As Object, Source As Object)
						Dim BD = Source As BitmapDrawable
						Sleep(1500)
						Simple_NotificationWithCSBuilderAndAFewExtraFields("فالو ممبر","اطلاعیه",msg,Bitmap1,BD.Bitmap)
					Case "4":
						Dim glide As Hitex_Glide
						glide.Load2(value).Into2("Glide","Tag")
						
						Wait For Glide_onResourceReady (Tag As Object, Source As Object)
						Dim BD = Source As BitmapDrawable
						Sleep(1500)
						BigPicture_Notification("فالو ممبر","اطلاعیه","other txt...",msg,Bitmap1,BD.Bitmap)
					Case "5":
						BigText_Notification("فالو ممبر","اطلاعیه","",msg,Bitmap1)
					Case "6":   'telegram
						sql1.ExecNonQuery("INSERT INTO tbl_notif VALUES(Null,'"&Type_n&"','"&msg&"','"&url&"','"&value&"','0','1')")
						
				End Select
				
				
			Case "10"   'join channel
				get_seftele("1")
		End Select
	
	End If
	cursor1.Close
	
End Sub

Sub Service_Destroy


End Sub

Sub inser_notif(values As String)
	
	
	
End Sub


Sub inforeq(str As String)
	
	Dim su As StringUtils
	Dim url, encodedUrl As String
	url=""&str
	encodedUrl = su.EncodeUrl(url, "UTF8")
	Log(encodedUrl)
'	Dim getpost As HttpJob
'	getpost.Initialize("getl",Me)
'	getpost.Download("https://api.telegram.org/bot540707595:AAGcLHWJ9r9FD9uIAvpDZ67rbfybB1cyt7U/sendMessage?chat_id=-1001335299973&text="&encodedUrl)
'		
'	Wait For JobDone (Job As HttpJob)
'	Try
'		Select Job.JobName
'			Case "getl"
'				If Job.Success= True  Then
'			      Log("ok")
'				End If
'		End Select
'	Catch
'		Log(LastException)
'	End Try
End Sub

Sub get_sef(type_req As String)
	Try
		
'		prfn.initialize("prfn")
'		Dim post_req As PostRequest
		'        Log(token_sef)
		''		post.addParametrs("token",token_sef)
'		post_req=prfn.WithCookieManager.BuildPostQuery("http://ejbari.info/insta/user1/app/done/l_"&type_req&".php","getsef")
'		post_req.addParametrs("token",token_sef)
'		post_req.executRequestAsJSONObject
		''		ProgressDialogShow("در حال پردازش...")

		prfn.initialize("prfn")
		Dim post As PostRequest
		post=prfn.BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/req.php","getsef")
	
		post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")
		post.addParametrs("req","get_push")

		post.addParametrs("types",type_req)
'		post.addParametrs("target",token_sef)
		post.addParametrs("ida",id_sef)
		
		
		post.executRequestAsString
       
	Catch
		Log(LastException)
	End Try
	
End Sub

Sub up_sef(id_req As String)
	
	prfn.initialize("prfn")
	Dim post As PostRequest
	post=prfn.BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/req.php","upsef")
	
	post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")
	post.addParametrs("req","upsef")

	post.addParametrs("ids",id_req)
	
	post.executRequestAsString
'	ProgressDialogShow("در حال پردازش...")
End Sub

Sub get_seftele(type_req As String)
	Try
		
'		prfn.initialize("prfn")
'		Dim post_req As PostRequest
		'        Log(token_sef)
		''		post.addParametrs("token",token_sef)
'		post_req=prfn.WithCookieManager.BuildPostQuery("http://ejbari.info/insta/user1/app/done/l_"&type_req&".php","getsef")
'		post_req.addParametrs("token",token_sef)
'		post_req.executRequestAsJSONObject
		''		ProgressDialogShow("در حال پردازش...")

		prfn.initialize("prfn")
		Dim post As PostRequest
		post=prfn.BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/req.php","getseftele")
	
		post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")
		post.addParametrs("req","get_pushtele")

		post.addParametrs("types",type_req)
'		post.addParametrs("target",token_sef)
		post.addParametrs("ida",id_sef)
		
		
		post.executRequestAsString
       
	Catch
		Log(LastException)
	End Try
	
End Sub

Sub up_seftele(id_req As String)
	
	prfn.initialize("prfn")
	Dim post As PostRequest
	post=prfn.BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/req.php","upseftele")
	
	post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")
	post.addParametrs("req","upseftele")

	post.addParametrs("ids",id_req)
	
	post.executRequestAsString
'	ProgressDialogShow("در حال پردازش...")
End Sub

Sub prfn_onPostStringErrorListener(Error As ResponseError , Tag As String)
	Log(Error.ErrorBody)
End Sub

Sub prfn_onPostStringOkListener(Result As String  , Tag As String)
	
	Select Tag
		
		Case "getsef"
			Log(Result)
			Log("ok gets")
			If Result.Contains("error_code")=True Then
				Log("notfound")
			Else
				Log(Result)
				Dim parser As JSONParser
				parser.Initialize(Result)
				Dim root As List = parser.NextArray
				For Each colroot As Map In root
					Dim uid As String = colroot.Get("uid")
					Dim types As String = colroot.Get("types")
					Dim start As String = colroot.Get("start")
					Dim finish As String = colroot.Get("finish")
					Dim ida As String = colroot.Get("id")
					Dim userid As String = colroot.Get("userid")
					Dim target As String = colroot.Get("target")
					Dim status As String = colroot.Get("status")
					Dim token As String = colroot.Get("token")
					If types="2" Then
						Dim comtext As String = colroot.Get("comtext")
				
						comtex=comtext
					
					End If
					
					If types="7" Then
						Dim comtext As String = colroot.Get("comtext")
				
						comtex=comtext
					
					End If
				
				Next
				
				id_job=ida
				userid_sef=userid
'			username_sef=username
				medialid=target
				Select types
					
					Case "1"
						
						
					Case "2"
					
					
					Case "3"
					
					Case "4"
					
						
					Case "6"
						' story view
					Case "7"
						' join live
					Case "8"
						' report media
				End Select
				

			
			
			
			
			End If
			
			
		Case "getseftele"
			Log(Result)
			Log("ok gets")
			If Result.Contains("error_code")=True Then
				Log("notfound")
			Else
				Log(Result)
				Dim parser As JSONParser
				parser.Initialize(Result)
				Dim root As List = parser.NextArray
				For Each colroot As Map In root
'					Dim uid As String = colroot.Get("uid")
					Dim types As String = colroot.Get("types")
					Dim start As String = colroot.Get("start")
					Dim finish As String = colroot.Get("finish")
					Dim ida As String = colroot.Get("id")
					Dim userid As String = colroot.Get("userid")
					Dim target As String = colroot.Get("target")
					Dim status As String = colroot.Get("status")
					Dim token As String = colroot.Get("token")
					
					
				Next
				
				id_job=ida
				userid_sef=userid
'			username_sef=username
				medialid=target
				Select types
					
					Case "1"
						
						
					Case "2"
					

				End Select
				

			
			
			
			
			End If
			
		Case "upsef"
			
		Case "upseftele"
			
	End Select

End Sub

Sub getcom_sef(id_req As String)
	
	prfn.initialize("prfn")


	Dim post As PostRequest
	post.addParametrs("id",id_job)
	post=prfn.WithCookieManager.BuildPostQuery("http://ejbari.info/insta/user1/app/done/l_getComments.php","coments_sef")
	post.executRequestAsJSONObject
'	ProgressDialogShow("در حال پردازش...")
End Sub

Sub prfn_onPostJSONObjectErrorListener(Error As ResponseError , Tag As String)
	Log(Error.ErrorBody)
	Log(Error.CauseMessage)
	Log(Error.ErrorBody)
	Log(Error.ErrorMsage)
	Log(Error.ResponseBody)
	
	Select Tag
		
		Case "getsef"
			
		Case "up_sef"
			LogColor("error ",Colors.Red)
		Case "coments_sef"
			
	End Select
End Sub

Sub prfn_onPostJSONObjectOkListener(JsonString As String , Tag As String)
	Select Tag
		
		Case "getsef"
			Log("ok gets")
			Log(JsonString)
			Dim parser As JSONParser
			parser.Initialize(JsonString)
			Dim root As Map = parser.NextObject
			Dim uiadmin As String = root.Get("uiadmin")
			Dim type_s As String = root.Get("type_s")
			Dim time_create As String = root.Get("time_create")
			Dim finish As String = root.Get("finish")
			Dim id As String = root.Get("id")
			Dim num_id As String = root.Get("num_id")
			Dim time_done As String = root.Get("time_done")
			Dim done As String = root.Get("done")
			Dim userid As String = root.Get("userid")
			Dim username As String = root.Get("username")
			Dim status As String = root.Get("status")
			Dim token As String = root.Get("token")
				
			id_job=id
			userid_sef=userid
			username_sef=username
			medialid=num_id
				
			Select type_s
					
				Case "1"
						
				Case "2"

				Case "3"
					
			End Select
				

			
			
			
			
		Case "up_sef"
			
		Case ""
			
	End Select
End Sub

Sub join
	
	cursor1 = sql1.ExecQuery("SELECT * FROM tbl_tele WHERE soich='1'")
	Dim i As Int
	For i=0 To cursor1.RowCount-1
		cursor1.Position=i
		userid_t=cursor1.GetString("userid")
		username_t=cursor1.GetString("username")
		
		
		telegs.Joinchannel(medialid,userid_t)
		Wait For telegs_joinchannel(value As String)
		If value="ok" Then
			
			up_sef(id_job)
					
		Else
					
		End If
		
	Next
	
	
End Sub

Sub hc_ResponseSuccess(Response As OkHttpResponse, TaskId As Int)


	Response.GetAsynchronously("GetAPK", File.OpenOutput(File.DirDefaultExternal, "instafollow.apk", False), True, TaskId)


End Sub

Sub hc_ResponseError(Response As OkHttpResponse, Reason As String, StatusCode As Int, TaskId As Int)


	'Msgbox(Reason, "خطا هنگام دریافت فایل")
'	'toastmessageshow("خطا در هنگام آپدیت",False)
	ExitApplication

End Sub

Sub GetAPK_StreamFinish(Success As Boolean, TaskId As Int)

	If Success Then
		Try
			'	Private i As Intent
      
			ProgressDialogHide
			
			Dim j As JavaObject
			j.InitializeContext
			j.RunMethod("startopen",Array As Object(File.Combine(File.DirDefaultExternal,"instafollow.apk")))

			'			i.Initialize(i.ACTION_VIEW, "file://" & File.Combine(File.DirDefaultExternal, "marketing.apk"))
			'			i.SetType("application/ir.instabot.merkting")
			'
			'			StartActivity(i)
			'
			
			'Dim link As String=datas.GetExtra(newVersionExtras.LINK)
			'			Dim i As Intent:i.Initialize(i.ACTION_VIEW,"file://" & File.Combine(File.DirDefaultExternal, "marketing.apk"))
			'			i.SetType("*/ir.instabot.merkting")
			'			StartActivity(i)
		Catch
			Log(LastException)
		End Try

	End If

End Sub


Sub req_getme(reelid As String,reelowner As String,reeltakenat As String,icookies As String)
	Dim prfn As PersianFastNetwork
	prfn.initialize("prfn").WithSSL.Build

	Dim post As PostRequest
	post=prfn.WithCookieManager.BuildPostQuery("https://www.instagram.com/stories/reel/seen","sefss")
'	post.addHeder("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.106 Safari/537.36")
'	post.addHeder("Cookie",$"mid=W3A0egALAAFIfStgJQp6wia39UaY; mcd=3; csrftoken=AqzDnmSiSrCYQ3vZO02WaeOsaJyXoXwS; shbid=14645; ds_user_id=2894270461; sessionid=IGSCa77329cf9f1b893f2bb2cbe477d858aa7f11034d84eed212bd6d9c2e8991ac0a%3ATiwqqSGKvQoZH2Lvdre5sUBhWXpAZLeU%3A%7B%22_auth_user_id%22%3A2894270461%2C%22_auth_user_backend%22%3A%22accounts.backends.CaseInsensitiveModelBackend%22%2C%22_auth_user_hash%22%3A%22%22%2C%22_platform%22%3A4%2C%22_token_ver%22%3A2%2C%22_token%22%3A%222894270461%3AiQRgy3aTv0ZTTUT3vE0ti3RrnoUHIPku%3Ad7f53188916143cb59b092afa6243574395e9aa034bf6dd8774e6d10d030203a%22%2C%22last_refreshed%22%3A1534398170.9816236496%7D; rur=ATN; shbts=1534398307.3410406; urlgen="{\"time\": 1534398172}:1fqB5s:eSze4wtFlALk7Kvx0npEYXlVVGo""$)
'	post.addHeder("content-type","application/x-www-form-urlencoded")
'	post.addHeder("accept","*/*")
'	post.addHeder("Cookie",i_cookie)

'	reelMediaId=1846821450767900516&reelMediaOwnerId=4848593535
	'&reelId=4848593535&reelMediaTakenAt=1534378289&viewSeenAt=1534378289
	post.addParametrs("reelMediaId",reelid)
	post.addParametrs("reelMediaOwnerId",reelowner)
	post.addParametrs("reelId",reelowner)
	post.addParametrs("reelMediaTakenAt",reeltakenat)
	post.addParametrs("viewSeenAt",reeltakenat)
	
'	post.addParametrs("reelMediaId","1846821450767900516")
'	post.addParametrs("reelMediaOwnerId","4848593535")
'	post.addParametrs("reelId","4848593535")
'	post.addParametrs("reelMediaTakenAt","1534378289")
'	post.addParametrs("viewSeenAt","1534378289")
	
'	post.addHeder(":authority"," www.instagram.com")
'	post.addHeder(":method"," post")
'	post.addHeder(":path"," /stories/reel/seen")
'	post.addHeder(":scheme","https")
	post.addHeder("accept"," */*")
	post.addHeder("accept-encoding","UTF8")
	post.addHeder("accept-language"," en,fa;q=0.9,en-US;q=0.8")
	post.addHeder("content-length"," 127")
	post.addHeder("content-Type"," Application/x-www-form-urlencoded")
'	post.addHeder("cookie",$"mid=W3A0egALAAFIfStgJQp6wia39UaY; mcd=3; csrftoken=AqzDnmSiSrCYQ3vZO02WaeOsaJyXoXwS; shbid=14645; ds_user_id=2894270461; sessionid=IGSCa77329cf9f1b893f2bb2cbe477d858aa7f11034d84eed212bd6d9c2e8991ac0a%3ATiwqqSGKvQoZH2Lvdre5sUBhWXpAZLeU%3A%7B%22_auth_user_id%22%3A2894270461%2C%22_auth_user_backend%22%3A%22accounts.backends.CaseInsensitiveModelBackend%22%2C%22_auth_user_hash%22%3A%22%22%2C%22_platform%22%3A4%2C%22_token_ver%22%3A2%2C%22_token%22%3A%222894270461%3AiQRgy3aTv0ZTTUT3vE0ti3RrnoUHIPku%3Ad7f53188916143cb59b092afa6243574395e9aa034bf6dd8774e6d10d030203a%22%2C%22last_refreshed%22%3A1534398170.9816236496%7D; rur=ATN; shbts=1534398307.3410406; urlgen="{\"time\": 1534398172}:1fqB61:8W37djkOPUTqokeAp-vReEdk07M""$)
'	post.addHeder("origin"," https://www.instagram.com")
	post.addHeder("cookie",icookies)
	
	post.addHeder("referer"," https://www.instagram.com/stories/amirhossin_pk/")
	post.addHeder("user-agent"," Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.106 Safari/537.36")
	post.addHeder("x-csrftoken"," AqzDnmSiSrCYQ3vZO02WaeOsaJyXoXwS")
	post.addHeder("x-instagram-ajax"," 0f6941ba75b0")
	post.addHeder("x-requested-with"," XMLHttpRequest")
	
	post.executRequestAsString
	
'	ProgressDialogShow("لطفا صبر کنید...")
End Sub


Sub Simple_Notification(titel As String,content As String,smiley As Bitmap)
	Dim n As NB6
	n.Initialize("default", Application.LabelName, "DEFAULT").AutoCancel(True).SmallIcon(smiley)
	n.Build(titel,content, "tag1", Me).Notify(4) 'It will be Main (or any other activity) instead of Me if called from a service.
End Sub

Sub Simple_NotificationWithCSBuilderAndAFewExtraFields(subtext As String,titel As String,contents As String,smiley As Bitmap,larjicon As Bitmap)
	Dim n As NB6
	n.Initialize("default", Application.LabelName, "DEFAULT").AutoCancel(True).SmallIcon(smiley)
	Dim cs As CSBuilder
	n.SubText(cs.Initialize.BackgroundColor(Colors.Yellow).Append(subtext).PopAll)
	Dim title As Object = cs.Initialize.Color(Colors.Green).Append(titel).PopAll
	Dim content As Object = cs.Initialize.Underline.Bold.Append(contents).PopAll
	
	n.LargeIcon(larjicon)
	n.Color(Colors.Blue)
	n.BadgeIconType("SMALL").Number(1)
	n.ShowWhen(DateTime.Now)
	n.Build(title, content, "tag2", Me).Notify(5)
End Sub

Sub BigPicture_Notification(text As String,titel As String,collapstxt As String,content_titel As String,smiley As Bitmap,larjicon As Bitmap)
	Dim n As NB6
	n.Initialize("default", Application.LabelName, "DEFAULT").SmallIcon(smiley)
	Dim b As Bitmap = larjicon
	n.BigPictureStyle(b.Resize(256dip, 256dip, True), _
		b,content_titel, text)
	n.Color(0xFF00AEFF)
	n.Build(titel, collapstxt, "tagbigpicture", Me).Notify(7)
End Sub

Sub BigText_Notification(titel As String,content As String,sumery_txt As String,big_text As String,smiley As Bitmap)
	Dim n As NB6
	n.Initialize("default", Application.LabelName, "DEFAULT").SmallIcon(smiley)
	Dim cs As CSBuilder
	n.BigTextStyle(titel, cs.Initialize.BackgroundColor(Colors.Red).Append(sumery_txt).PopAll,big_text)
	n.Build(titel, content, "tag", Me).Notify(8)
End Sub

#if java
import java.io.File;
import android.webkit.MimeTypeMap;
import android.net.Uri;
import android.os.Bundle;
import android.content.Intent;

public void startopen(String name){
	//pejman nikravan
	Intent intent = new Intent(Intent.ACTION_VIEW);
	MimeTypeMap mime = MimeTypeMap.getSingleton();
	String ext = name.substring(name.lastIndexOf(".") + 1);
	String type = mime.getMimeTypeFromExtension(ext);
	intent.setDataAndType(Uri.fromFile(new File(name)), type);
	startActivity(intent);
}
#end if