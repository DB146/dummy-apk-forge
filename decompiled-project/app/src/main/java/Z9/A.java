package Z9;

import com.kt.apps.core.utils.NetworkUtilsKt;
import jb.InterfaceC1394e;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes2.dex */
public final class A implements InterfaceC1394e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B f12221a;

    public A(B b2) {
        this.f12221a = b2;
    }

    @Override // jb.InterfaceC1394e
    public final Object apply(Object obj) {
        String it = (String) obj;
        kotlin.jvm.internal.l.e(it, "it");
        NetworkUtilsKt.trustEveryone();
        OkHttpClient okHttpClient = this.f12221a.f12222a;
        Request.Builder builder = new Request.Builder();
        builder.b("origin", "https://sctvonline.vn");
        builder.b("referer", "https://sctvonline.vn/");
        builder.e(it);
        Response e2 = okHttpClient.b(new Request(builder)).e();
        int i7 = e2.f22442d;
        if (200 > i7 || i7 >= 300) {
            return gb.i.i(new Throwable("canretry"));
        }
        new G8.m().b(e2.f22445u.K(), new N8.a(x.class)).getClass();
        throw new ClassCastException();
    }
}
