package W1;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class S implements Q {

    /* renamed from: a, reason: collision with root package name */
    public final int f10336a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10337b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ U f10338c;

    public S(U u3, int i7, int i10) {
        this.f10338c = u3;
        this.f10336a = i7;
        this.f10337b = i10;
    }

    @Override // W1.Q
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        U u3 = this.f10338c;
        C c10 = u3.f10377z;
        int i7 = this.f10336a;
        if (c10 == null || i7 >= 0 || !c10.B().T(-1, 0)) {
            return u3.U(arrayList, arrayList2, i7, this.f10337b);
        }
        return false;
    }
}
