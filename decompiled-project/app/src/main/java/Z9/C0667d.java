package Z9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.ResponseBody;
import y7.u0;

/* renamed from: Z9.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0667d implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12258a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0665b f12259b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f12260c;

    public /* synthetic */ C0667d(C0665b c0665b, String str) {
        this.f12259b = c0665b;
        this.f12260c = str;
    }

    public /* synthetic */ C0667d(String str, C0665b c0665b) {
        this.f12260c = str;
        this.f12259b = c0665b;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        switch (this.f12258a) {
            case 0:
                ResponseBody it = (ResponseBody) obj;
                kotlin.jvm.internal.l.e(it, "it");
                List r02 = ac.g.r0(it.K(), new String[]{"\n"});
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : r02) {
                    String str = (String) obj2;
                    if (ac.g.v0(str).toString().length() > 0 && !ac.n.Y(ac.g.v0(str).toString(), "#", false)) {
                        arrayList.add(obj2);
                    }
                }
                String str2 = this.f12260c;
                String substring = str2.substring(0, ac.g.f0(str2, ".m3u8", 0, 6) + 5);
                kotlin.jvm.internal.l.d(substring, "substring(...)");
                String substring2 = substring.substring(0, ac.g.i0(6, substring, "/"));
                kotlin.jvm.internal.l.d(substring2, "substring(...)");
                ArrayList arrayList2 = new ArrayList(Eb.p.S(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(substring2 + "/" + ((String) it2.next()));
                }
                this.f12259b.invoke(arrayList2);
                return Db.q.f3365a;
            default:
                kotlin.jvm.internal.l.e((Throwable) obj, "it");
                this.f12259b.invoke(u0.x(this.f12260c));
                return Db.q.f3365a;
        }
    }
}
