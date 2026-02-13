package ia;

import java.util.List;
import jb.InterfaceC1394e;
import kotlin.jvm.internal.l;
import ob.C1838f;

/* renamed from: ia.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1357c implements InterfaceC1394e {

    /* renamed from: b, reason: collision with root package name */
    public static final C1357c f18482b = new C1357c(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C1357c f18483c = new C1357c(1);

    /* renamed from: d, reason: collision with root package name */
    public static final C1357c f18484d = new C1357c(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18485a;

    public /* synthetic */ C1357c(int i7) {
        this.f18485a = i7;
    }

    @Override // jb.InterfaceC1394e
    public final Object apply(Object obj) {
        switch (this.f18485a) {
            case 0:
                List it = (List) obj;
                l.e(it, "it");
                return it;
            case 1:
                l.e((List) obj, "it");
                return C1838f.f22215a;
            default:
                List it2 = (List) obj;
                l.e(it2, "it");
                return it2;
        }
    }
}
