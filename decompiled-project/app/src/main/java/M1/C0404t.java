package M1;

import fc.InterfaceC1162i;
import java.util.List;
import t3.C2025h;
import ta.C2036a;

/* renamed from: M1.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0404t implements InterfaceC1162i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6717a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1162i f6718b;

    public /* synthetic */ C0404t(InterfaceC1162i interfaceC1162i, int i7) {
        this.f6717a = i7;
        this.f6718b = interfaceC1162i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0109  */
    @Override // fc.InterfaceC1162i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Hb.d dVar) {
        C0403s c0403s;
        int i7;
        fc.G g;
        int i10;
        C2025h c2025h;
        int i11;
        C2036a c2036a;
        int i12;
        switch (this.f6717a) {
            case 0:
                if (dVar instanceof C0403s) {
                    c0403s = (C0403s) dVar;
                    int i13 = c0403s.f6715b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c0403s.f6715b = i13 - Integer.MIN_VALUE;
                        Object obj2 = c0403s.f6714a;
                        Ib.a aVar = Ib.a.f5345a;
                        i7 = c0403s.f6715b;
                        if (i7 != 0) {
                            com.bumptech.glide.c.c0(obj2);
                            b0 b0Var = (b0) obj;
                            if (b0Var instanceof U) {
                                throw ((U) b0Var).f6635b;
                            }
                            if (!(b0Var instanceof C0389d)) {
                                if (b0Var instanceof S ? true : b0Var instanceof c0) {
                                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                }
                                throw new Db.d(1);
                            }
                            Object obj3 = ((C0389d) b0Var).f6660b;
                            c0403s.f6715b = 1;
                            if (this.f6718b.emit(obj3, c0403s) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            com.bumptech.glide.c.c0(obj2);
                        }
                        return Db.q.f3365a;
                    }
                }
                c0403s = new C0403s(this, dVar);
                Object obj22 = c0403s.f6714a;
                Ib.a aVar2 = Ib.a.f5345a;
                i7 = c0403s.f6715b;
                if (i7 != 0) {
                }
                return Db.q.f3365a;
            case 1:
                if (dVar instanceof fc.G) {
                    g = (fc.G) dVar;
                    int i14 = g.f17070b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        g.f17070b = i14 - Integer.MIN_VALUE;
                        Object obj4 = g.f17069a;
                        Ib.a aVar3 = Ib.a.f5345a;
                        i10 = g.f17070b;
                        if (i10 != 0) {
                            com.bumptech.glide.c.c0(obj4);
                            if (obj != null) {
                                g.f17070b = 1;
                                if (this.f6718b.emit(obj, g) == aVar3) {
                                    return aVar3;
                                }
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            com.bumptech.glide.c.c0(obj4);
                        }
                        return Db.q.f3365a;
                    }
                }
                g = new fc.G(this, dVar);
                Object obj42 = g.f17069a;
                Ib.a aVar32 = Ib.a.f5345a;
                i10 = g.f17070b;
                if (i10 != 0) {
                }
                return Db.q.f3365a;
            case 2:
                if (dVar instanceof C2025h) {
                    c2025h = (C2025h) dVar;
                    int i15 = c2025h.f24470b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        c2025h.f24470b = i15 - Integer.MIN_VALUE;
                        Object obj5 = c2025h.f24469a;
                        Ib.a aVar4 = Ib.a.f5345a;
                        i11 = c2025h.f24470b;
                        if (i11 != 0) {
                            com.bumptech.glide.c.c0(obj5);
                            if (obj instanceof m3.b) {
                                c2025h.f24470b = 1;
                                if (this.f6718b.emit(obj, c2025h) == aVar4) {
                                    return aVar4;
                                }
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            com.bumptech.glide.c.c0(obj5);
                        }
                        return Db.q.f3365a;
                    }
                }
                c2025h = new C2025h(this, dVar);
                Object obj52 = c2025h.f24469a;
                Ib.a aVar42 = Ib.a.f5345a;
                i11 = c2025h.f24470b;
                if (i11 != 0) {
                }
                return Db.q.f3365a;
            default:
                if (dVar instanceof C2036a) {
                    c2036a = (C2036a) dVar;
                    int i16 = c2036a.f24517b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        c2036a.f24517b = i16 - Integer.MIN_VALUE;
                        Object obj6 = c2036a.f24516a;
                        Ib.a aVar5 = Ib.a.f5345a;
                        i12 = c2036a.f24517b;
                        if (i12 != 0) {
                            com.bumptech.glide.c.c0(obj6);
                            y9.I i17 = (y9.I) obj;
                            Object obj7 = i17 instanceof y9.G ? (List) ((y9.G) i17).f27483a : Eb.v.f3891a;
                            c2036a.f24517b = 1;
                            if (this.f6718b.emit(obj7, c2036a) == aVar5) {
                                return aVar5;
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            com.bumptech.glide.c.c0(obj6);
                        }
                        return Db.q.f3365a;
                    }
                }
                c2036a = new C2036a(this, dVar);
                Object obj62 = c2036a.f24516a;
                Ib.a aVar52 = Ib.a.f5345a;
                i12 = c2036a.f24517b;
                if (i12 != 0) {
                }
                return Db.q.f3365a;
        }
    }
}
