package w;

import x.InterfaceC2249t;
import x.c0;

/* loaded from: classes.dex */
public final class z extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25635a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H f25636b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I f25637c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(H h10, I i7, int i10) {
        super(1);
        this.f25635a = i10;
        this.f25636b = h10;
        this.f25637c = i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r3.f25637c.f25513a.f25542c != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        if (r3.f25636b.f25510a.f25542c != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0081, code lost:
    
        if (r3.f25637c.f25513a.f25540a != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0093, code lost:
    
        if (r3.f25636b.f25510a.f25540a != null) goto L48;
     */
    @Override // Rb.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        InterfaceC2249t interfaceC2249t;
        InterfaceC2249t interfaceC2249t2;
        N n6;
        switch (this.f25635a) {
            case 0:
                c0 c0Var = (c0) obj;
                x xVar = x.f25625a;
                x xVar2 = x.f25626b;
                if (c0Var.b(xVar, xVar2)) {
                    J j = this.f25636b.f25510a.f25540a;
                    return (j == null || (interfaceC2249t2 = j.f25514a) == null) ? AbstractC2173C.f25488b : interfaceC2249t2;
                }
                if (!c0Var.b(xVar2, x.f25627c)) {
                    return AbstractC2173C.f25488b;
                }
                J j10 = this.f25637c.f25513a.f25540a;
                return (j10 == null || (interfaceC2249t = j10.f25514a) == null) ? AbstractC2173C.f25488b : interfaceC2249t;
            case 1:
                int ordinal = ((x) obj).ordinal();
                float f4 = 0.0f;
                if (ordinal == 0) {
                    break;
                } else {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            throw new Db.d(1);
                        }
                        break;
                    }
                    f4 = 1.0f;
                }
                return Float.valueOf(f4);
            case 2:
                c0 c0Var2 = (c0) obj;
                x xVar3 = x.f25625a;
                x xVar4 = x.f25626b;
                if (c0Var2.b(xVar3, xVar4)) {
                    N n8 = this.f25636b.f25510a.f25542c;
                    return n8 != null ? n8.f25520b : AbstractC2173C.f25488b;
                }
                if (c0Var2.b(xVar4, x.f25627c) && (n6 = this.f25637c.f25513a.f25542c) != null) {
                    return n6.f25520b;
                }
                return AbstractC2173C.f25488b;
            default:
                int ordinal2 = ((x) obj).ordinal();
                float f10 = 0.92f;
                if (ordinal2 == 0) {
                    break;
                } else {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            throw new Db.d(1);
                        }
                        break;
                    }
                    f10 = 1.0f;
                }
                return Float.valueOf(f10);
        }
    }
}
