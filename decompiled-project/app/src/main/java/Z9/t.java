package Z9;

import A9.N2;
import P4.C0463k;
import ca.C0918a;
import com.kt.apps.core.tv.model.TVChannel;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.OkHttpClient;
import okhttp3.Response;

/* loaded from: classes2.dex */
public final class t implements Y9.a {

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f12310a;

    /* renamed from: b, reason: collision with root package name */
    public final C0918a f12311b;

    /* renamed from: c, reason: collision with root package name */
    public final Db.o f12312c;

    public t(OkHttpClient okHttpClient, C0918a tvStorage) {
        kotlin.jvm.internal.l.e(tvStorage, "tvStorage");
        this.f12310a = okHttpClient;
        this.f12311b = tvStorage;
        this.f12312c = android.support.v4.media.session.b.z(new N2(this, 19));
    }

    @Override // Y9.a
    public final gb.i a() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override // Y9.a
    public final gb.i b(TVChannel tvChannel, boolean z8) {
        kotlin.jvm.internal.l.e(tvChannel, "tvChannel");
        return new qb.m(new F8.a(8, this, tvChannel), 2).h(new C0463k(this, 18));
    }

    public final void c(Response response) {
        String b2 = response.f22444f.b("Set-Cookie");
        if (b2 != null) {
            Iterator it = ac.g.r0(b2, new String[]{";"}).iterator();
            while (it.hasNext()) {
                List r02 = ac.g.r0((String) it.next(), new String[]{"="});
                if (r02.size() != 2) {
                    r02 = null;
                }
                if (r02 != null) {
                    ((Map) this.f12312c.getValue()).put(r02.get(0), r02.get(1));
                }
            }
        }
    }
}
