package zc;

/* loaded from: classes2.dex */
public final class k extends p {

    /* renamed from: a, reason: collision with root package name */
    public final int f28387a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28388b;

    public k(int i7, int i10) {
        this.f28388b = i10;
        this.f28387a = i7;
    }

    @Override // zc.p
    public final boolean b(xc.l lVar, xc.l lVar2) {
        switch (this.f28388b) {
            case 0:
                return lVar2.f0() == this.f28387a;
            case 1:
                return lVar2.f0() > this.f28387a;
            default:
                return lVar != lVar2 && lVar2.f0() < this.f28387a;
        }
    }

    public final String toString() {
        switch (this.f28388b) {
            case 0:
                return String.format(":eq(%d)", Integer.valueOf(this.f28387a));
            case 1:
                return String.format(":gt(%d)", Integer.valueOf(this.f28387a));
            default:
                return String.format(":lt(%d)", Integer.valueOf(this.f28387a));
        }
    }
}
