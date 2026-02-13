package Ba;

import l2.I;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements I, kotlin.jvm.internal.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2259a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rb.c f2260b;

    public /* synthetic */ j(Rb.c cVar, int i7) {
        this.f2259a = i7;
        this.f2260b = cVar;
    }

    @Override // kotlin.jvm.internal.g
    public final Db.c a() {
        switch (this.f2259a) {
            case 0:
                return (i) this.f2260b;
            case 1:
                return (o) this.f2260b;
            case 2:
                return (o) this.f2260b;
            case 3:
                return (o) this.f2260b;
            case 4:
                return (Ea.d) this.f2260b;
            case 5:
                return (o) this.f2260b;
            case 6:
                return (o) this.f2260b;
            default:
                return (i) this.f2260b;
        }
    }

    @Override // l2.I
    public final /* synthetic */ void b(Object obj) {
        switch (this.f2259a) {
            case 0:
                ((i) this.f2260b).invoke(obj);
                return;
            case 1:
                ((o) this.f2260b).invoke(obj);
                return;
            case 2:
                ((o) this.f2260b).invoke(obj);
                return;
            case 3:
                ((o) this.f2260b).invoke(obj);
                return;
            case 4:
                ((Ea.d) this.f2260b).invoke(obj);
                return;
            case 5:
                ((o) this.f2260b).invoke(obj);
                return;
            case 6:
                ((o) this.f2260b).invoke(obj);
                return;
            default:
                ((i) this.f2260b).invoke(obj);
                return;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f2259a) {
            case 0:
                if ((obj instanceof I) && (obj instanceof kotlin.jvm.internal.g)) {
                    return ((i) this.f2260b).equals(((kotlin.jvm.internal.g) obj).a());
                }
                return false;
            case 1:
                if ((obj instanceof I) && (obj instanceof kotlin.jvm.internal.g)) {
                    return ((o) this.f2260b).equals(((kotlin.jvm.internal.g) obj).a());
                }
                return false;
            case 2:
                if ((obj instanceof I) && (obj instanceof kotlin.jvm.internal.g)) {
                    return ((o) this.f2260b).equals(((kotlin.jvm.internal.g) obj).a());
                }
                return false;
            case 3:
                if ((obj instanceof I) && (obj instanceof kotlin.jvm.internal.g)) {
                    return ((o) this.f2260b).equals(((kotlin.jvm.internal.g) obj).a());
                }
                return false;
            case 4:
                if ((obj instanceof I) && (obj instanceof kotlin.jvm.internal.g)) {
                    return ((Ea.d) this.f2260b).equals(((kotlin.jvm.internal.g) obj).a());
                }
                return false;
            case 5:
                if ((obj instanceof I) && (obj instanceof kotlin.jvm.internal.g)) {
                    return ((o) this.f2260b).equals(((kotlin.jvm.internal.g) obj).a());
                }
                return false;
            case 6:
                if ((obj instanceof I) && (obj instanceof kotlin.jvm.internal.g)) {
                    return ((o) this.f2260b).equals(((kotlin.jvm.internal.g) obj).a());
                }
                return false;
            default:
                if ((obj instanceof I) && (obj instanceof kotlin.jvm.internal.g)) {
                    return ((i) this.f2260b).equals(((kotlin.jvm.internal.g) obj).a());
                }
                return false;
        }
    }

    public final int hashCode() {
        switch (this.f2259a) {
            case 0:
                return ((i) this.f2260b).hashCode();
            case 1:
                return ((o) this.f2260b).hashCode();
            case 2:
                return ((o) this.f2260b).hashCode();
            case 3:
                return ((o) this.f2260b).hashCode();
            case 4:
                return ((Ea.d) this.f2260b).hashCode();
            case 5:
                return ((o) this.f2260b).hashCode();
            case 6:
                return ((o) this.f2260b).hashCode();
            default:
                return ((i) this.f2260b).hashCode();
        }
    }
}
