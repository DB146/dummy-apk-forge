package S9;

import Db.q;
import Eb.B;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.Bundle;
import android.os.CancellationSignal;
import cc.E;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kt.apps.core.storage.local.RoomDataBase;
import com.kt.apps.core.storage.local.RoomDataBase_Impl;
import com.kt.apps.core.tv.model.ChannelSourceConfig;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.tv.model.TVChannelGroup;
import com.kt.apps.core.update.downloadmanager.ApkDownloader;
import com.kt.apps.core.utils.blurry.BlurFactor;
import e7.AbstractC1097a;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import y6.C2399e;
import y7.u0;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9190a;

    public /* synthetic */ a(int i7) {
        this.f9190a = i7;
    }

    public /* synthetic */ a(RoomDataBase_Impl roomDataBase_Impl, int i7) {
        this.f9190a = i7;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Db.g, java.lang.Object] */
    @Override // Rb.a
    public final Object invoke() {
        Class<?> returnType;
        List radioGroup_delegate$lambda$0;
        E _downloadScope_delegate$lambda$0;
        HashMap _queueStatus_delegate$lambda$3;
        q qVar;
        q qVar2;
        q qVar3;
        int i7 = 0;
        switch (this.f9190a) {
            case 0:
                C2399e c2399e = RoomDataBase.f16124l;
                return new M2.a(2, 3);
            case 1:
                C2399e c2399e2 = RoomDataBase.f16124l;
                return new M2.a(3, 4);
            case 2:
                C2399e c2399e3 = RoomDataBase.f16124l;
                return new M2.a(4, 5);
            case 3:
                C2399e c2399e4 = RoomDataBase.f16124l;
                return new M2.a(5, 6);
            case 4:
                C2399e c2399e5 = RoomDataBase.f16124l;
                return new M2.a(6, 7);
            case 5:
                C2399e c2399e6 = RoomDataBase.f16124l;
                return new M2.a(7, 8);
            case 6:
                C2399e c2399e7 = RoomDataBase.f16124l;
                return new M2.a(8, 9);
            case 7:
                int i10 = RoomDataBase_Impl.f16138K;
                return new U9.j(i7);
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                int i11 = RoomDataBase_Impl.f16138K;
                return new U9.i(0);
            case 9:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 10:
                try {
                    Method method = (Method) V2.c.f9997d.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                FirebaseAnalytics a9 = AbstractC1097a.a();
                a9.f15822a.zzL(new Bundle(new Bundle()));
                return a9;
            case 12:
                return new LinkedHashMap();
            case 13:
                return new ChannelSourceConfig("https://hplus.com.vn/", "tivi-online/", "content/getlinkvideo/");
            case 14:
                return new LinkedHashMap();
            case 15:
                return new Object();
            case 16:
                return B.H(new Db.j("Origin", "https://sctvonline.vn"), new Db.j("Referer", "https://sctvonline.vn/"), new Db.j("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/132.0.0.0 Safari/537.36"), new Db.j("Accept", "*/*"), new Db.j("Accept-Encoding", "gzip, deflate, br"), new Db.j("Accept-Language", "en-US,en;q=0.9,vi;q=0.8"), new Db.j("Connection", "keep-alive"), new Db.j("Sec-Fetch-Dest", "empty"), new Db.j("Sec-Fetch-Mode", "cors"), new Db.j("Sec-Fetch-Site", "same-site"), new Db.j("x-user-agent", "vn.sctvonline.web/2.16.118.92253 (Mac OS/10.15.7; Macintosh; desktop)"));
            case 17:
                return u0.y(TVChannelGroup.VOV, TVChannelGroup.VOH);
            case 18:
                return "{\n  \"iss\": \"VO\",\n  \"sub\": \"{random_id}\",\n  \"exp\": {time_stamp_exp},\n  \"iat\": {time_stamp},\n  \"jti\": \"{jti}\",\n  \"scope\": \"cm:read cas:read cas:write billing:read\",\n  \"di\": \"{random_id_2}\",\n  \"ua\": \"Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36\",\n  \"dt\": \"web\",\n  \"mth\": \"mobile\",\n  \"ispre\": 0,\n  \"md\": \"Mac OS 10.15.7\",\n  \"version\": \"1626171878\",\n  \"isg\": 0,\n  \"adid\": \"\",\n  \"aud\": \"VO\"\n}";
            case 19:
                return "{\"exp\":{time_stamp_exp},\"jti\": \"{jti}\",\"iss\": \"vieon.vn\",\"sub\": \"{random_id}\",\"uid\": \"{random_id}\",\"isKid\": 0\n}";
            case 20:
                return new ChannelSourceConfig("http://vovmedia.vn/", "", "");
            case 21:
                return u0.y(308, 307, 300, 301, 302, 303, 305);
            case 22:
                return new ChannelSourceConfig("https://vtvgo.vn/", "trang-chu.html", "ajax-get-stream");
            case 23:
                return new ChannelSourceConfig("https://portal.vtc.gov.vn/", "live", "StreamChannelPlayer/GetProtectedStreamUrl");
            case 24:
                radioGroup_delegate$lambda$0 = TVChannel.radioGroup_delegate$lambda$0();
                return radioGroup_delegate$lambda$0;
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                _downloadScope_delegate$lambda$0 = ApkDownloader._downloadScope_delegate$lambda$0();
                return _downloadScope_delegate$lambda$0;
            case 26:
                _queueStatus_delegate$lambda$3 = ApkDownloader._queueStatus_delegate$lambda$3();
                return _queueStatus_delegate$lambda$3;
            case 27:
                qVar = q.f3365a;
                return qVar;
            case 28:
                qVar2 = q.f3365a;
                return qVar2;
            default:
                qVar3 = q.f3365a;
                return qVar3;
        }
    }
}
