package l2;

/* renamed from: l2.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1455F {

    /* renamed from: a, reason: collision with root package name */
    public final I f19156a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19157b;

    /* renamed from: c, reason: collision with root package name */
    public int f19158c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC1456G f19159d;

    public AbstractC1455F(AbstractC1456G abstractC1456G, I i7) {
        this.f19159d = abstractC1456G;
        this.f19156a = i7;
    }

    public final void a(boolean z8) {
        if (z8 == this.f19157b) {
            return;
        }
        this.f19157b = z8;
        int i7 = z8 ? 1 : -1;
        AbstractC1456G abstractC1456G = this.f19159d;
        int i10 = abstractC1456G.f19162c;
        abstractC1456G.f19162c = i7 + i10;
        if (!abstractC1456G.f19163d) {
            abstractC1456G.f19163d = true;
            while (true) {
                try {
                    int i11 = abstractC1456G.f19162c;
                    if (i10 == i11) {
                        break;
                    }
                    boolean z10 = i10 == 0 && i11 > 0;
                    boolean z11 = i10 > 0 && i11 == 0;
                    if (z10) {
                        abstractC1456G.g();
                    } else if (z11) {
                        abstractC1456G.h();
                    }
                    i10 = i11;
                } catch (Throwable th) {
                    abstractC1456G.f19163d = false;
                    throw th;
                }
            }
            abstractC1456G.f19163d = false;
        }
        if (this.f19157b) {
            abstractC1456G.c(this);
        }
    }

    public void b() {
    }

    public boolean c(InterfaceC1479x interfaceC1479x) {
        return false;
    }

    public abstract boolean d();
}
