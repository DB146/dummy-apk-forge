package C;

import A0.AbstractC0017g;
import h0.AbstractC1217d;
import h0.C1221h;
import h0.C1229p;
import h0.C1230q;
import java.io.Serializable;
import y0.AbstractC2322G;
import y0.AbstractC2323H;
import y0.InterfaceC2336d;

/* renamed from: C.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0234t extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2434a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2435b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2436c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2438e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Serializable f2439f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0234t(C1230q c1230q, C1229p c1229p, C1229p c1229p2, Object obj, int i7, D d10, int i10) {
        super(1);
        this.f2434a = i10;
        this.f2436c = c1229p;
        this.f2437d = c1229p2;
        this.f2438e = obj;
        this.f2435b = i7;
        this.f2439f = d10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0234t(AbstractC2323H[] abstractC2323HArr, u uVar, int i7, A0.T t5, int[] iArr) {
        super(1);
        this.f2434a = 0;
        this.f2436c = abstractC2323HArr;
        this.f2437d = uVar;
        this.f2435b = i7;
        this.f2438e = t5;
        this.f2439f = iArr;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        switch (this.f2434a) {
            case 0:
                AbstractC2322G abstractC2322G = (AbstractC2322G) obj;
                AbstractC2323H[] abstractC2323HArr = (AbstractC2323H[]) this.f2436c;
                int length = abstractC2323HArr.length;
                int i7 = 0;
                int i10 = 0;
                while (i7 < length) {
                    AbstractC2323H abstractC2323H = abstractC2323HArr[i7];
                    int i11 = i10 + 1;
                    kotlin.jvm.internal.l.b(abstractC2323H);
                    boolean z8 = abstractC2323H.d() instanceof H;
                    V0.l layoutDirection = ((A0.T) this.f2438e).getLayoutDirection();
                    ((u) this.f2437d).getClass();
                    float f4 = ((this.f2435b - abstractC2323H.f26554a) - 0) / 2.0f;
                    float f10 = -1.0f;
                    if (layoutDirection != V0.l.f9982a) {
                        f10 = (-1.0f) * (-1);
                    }
                    abstractC2322G.d(abstractC2323H, Math.round((1 + f10) * f4), ((int[]) this.f2439f)[i10], 0.0f);
                    i7++;
                    i10 = i11;
                }
                return Db.q.f3365a;
            case 1:
                InterfaceC2336d interfaceC2336d = (InterfaceC2336d) obj;
                C1229p c1229p = (C1229p) this.f2437d;
                if (((C1229p) this.f2436c) != ((C1221h) ((B0.D) AbstractC0017g.u(c1229p)).getFocusOwner()).j) {
                    return Boolean.TRUE;
                }
                boolean C2 = AbstractC1217d.C(c1229p, (C1229p) this.f2438e, this.f2435b, (D) this.f2439f);
                Boolean valueOf = Boolean.valueOf(C2);
                if (C2 || !interfaceC2336d.a()) {
                    return valueOf;
                }
                return null;
            default:
                InterfaceC2336d interfaceC2336d2 = (InterfaceC2336d) obj;
                C1229p c1229p2 = (C1229p) this.f2437d;
                if (((C1229p) this.f2436c) != ((C1221h) ((B0.D) AbstractC0017g.u(c1229p2)).getFocusOwner()).j) {
                    return Boolean.TRUE;
                }
                boolean B10 = AbstractC1217d.B(this.f2435b, (D) this.f2439f, c1229p2, (i0.c) this.f2438e);
                Boolean valueOf2 = Boolean.valueOf(B10);
                if (B10 || !interfaceC2336d2.a()) {
                    return valueOf2;
                }
                return null;
        }
    }
}
