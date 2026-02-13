package N;

import C.O;
import Q.C0480b;
import Q.C0506o;
import java.util.ArrayList;
import java.util.List;
import x.i0;
import y0.AbstractC2323H;
import y0.InterfaceC2332Q;
import y7.u0;

/* loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.m implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7072a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7073b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y.e f7074c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7076e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7077f;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f7078u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f7079v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(int i7, Y.e eVar, Y.e eVar2, Y.e eVar3, Y.e eVar4, O.b bVar, Y.e eVar5) {
        super(2);
        this.f7073b = i7;
        this.f7074c = eVar;
        this.f7075d = eVar2;
        this.f7076e = eVar3;
        this.f7077f = eVar4;
        this.f7079v = bVar;
        this.f7078u = eVar5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(O o10, InterfaceC2332Q interfaceC2332Q, ArrayList arrayList, int i7, ArrayList arrayList2, Integer num, Y.e eVar) {
        super(2);
        this.f7075d = o10;
        this.f7076e = interfaceC2332Q;
        this.f7077f = arrayList;
        this.f7073b = i7;
        this.f7078u = arrayList2;
        this.f7079v = num;
        this.f7074c = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Y.e eVar, Y.e eVar2, Y.e eVar3, int i7, O o10, Y.e eVar4, Y.e eVar5) {
        super(2);
        this.f7074c = eVar;
        this.f7075d = eVar2;
        this.f7076e = eVar3;
        this.f7073b = i7;
        this.f7079v = o10;
        this.f7077f = eVar4;
        this.f7078u = eVar5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(i0 i0Var, c0.m mVar, Rb.c cVar, c0.e eVar, Rb.c cVar2, Y.e eVar2, int i7) {
        super(2);
        this.f7075d = i0Var;
        this.f7076e = mVar;
        this.f7077f = cVar;
        this.f7078u = eVar;
        this.f7079v = cVar2;
        this.f7074c = eVar2;
        this.f7073b = i7;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        Integer num;
        Object obj3;
        Object obj4;
        Object obj5;
        ArrayList arrayList;
        ArrayList arrayList2;
        H2.O o10;
        Object obj6;
        Integer num2;
        int B10;
        int a9;
        Object obj7;
        Object obj8;
        int B11;
        int B12;
        switch (this.f7072a) {
            case 0:
                C0506o c0506o = (C0506o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0506o.x()) {
                    c0506o.N();
                } else {
                    w.b(this.f7073b, this.f7074c, (Y.e) this.f7075d, (Y.e) this.f7076e, (Y.e) this.f7077f, (O.b) this.f7079v, (Y.e) this.f7078u, c0506o, 0);
                }
                return Db.q.f3365a;
            case 1:
                C0506o c0506o2 = (C0506o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0506o2.x()) {
                    c0506o2.N();
                } else {
                    boolean isEmpty = ((ArrayList) this.f7077f).isEmpty();
                    O o11 = (O) this.f7075d;
                    InterfaceC2332Q interfaceC2332Q = (InterfaceC2332Q) this.f7076e;
                    float W10 = isEmpty ? interfaceC2332Q.W(o11.b(interfaceC2332Q)) : interfaceC2332Q.W(this.f7073b);
                    float W11 = (((ArrayList) this.f7078u).isEmpty() || (num = (Integer) this.f7079v) == null) ? interfaceC2332Q.W(o11.a(interfaceC2332Q)) : interfaceC2332Q.W(num.intValue());
                    V0.l layoutDirection = interfaceC2332Q.getLayoutDirection();
                    V0.l lVar = V0.l.f9982a;
                    float W12 = layoutDirection == lVar ? interfaceC2332Q.W(o11.d(interfaceC2332Q, layoutDirection)) : interfaceC2332Q.W(o11.c(interfaceC2332Q, layoutDirection));
                    V0.l layoutDirection2 = interfaceC2332Q.getLayoutDirection();
                    this.f7074c.a(new C.F(W12, W10, layoutDirection2 == lVar ? interfaceC2332Q.W(o11.c(interfaceC2332Q, layoutDirection2)) : interfaceC2332Q.W(o11.d(interfaceC2332Q, layoutDirection2)), W11), c0506o2, 0);
                }
                return Db.q.f3365a;
            case 2:
                InterfaceC2332Q interfaceC2332Q2 = (InterfaceC2332Q) obj;
                long j = ((V0.a) obj2).f9967a;
                int h10 = V0.a.h(j);
                int g = V0.a.g(j);
                long a10 = V0.a.a(0, 0, j);
                List K10 = interfaceC2332Q2.K(x.f7113a, this.f7074c);
                ArrayList arrayList3 = new ArrayList(K10.size());
                int size = K10.size();
                for (int i7 = 0; i7 < size; i7++) {
                    arrayList3.add(((y0.z) K10.get(i7)).b(a10));
                }
                if (arrayList3.isEmpty()) {
                    obj3 = null;
                } else {
                    obj3 = arrayList3.get(0);
                    int i10 = ((AbstractC2323H) obj3).f26555b;
                    int s3 = u0.s(arrayList3);
                    if (1 <= s3) {
                        int i11 = 1;
                        while (true) {
                            Object obj9 = arrayList3.get(i11);
                            int i12 = ((AbstractC2323H) obj9).f26555b;
                            if (i10 < i12) {
                                obj3 = obj9;
                                i10 = i12;
                            }
                            if (i11 != s3) {
                                i11++;
                            }
                        }
                    }
                }
                AbstractC2323H abstractC2323H = (AbstractC2323H) obj3;
                int i13 = abstractC2323H != null ? abstractC2323H.f26555b : 0;
                List K11 = interfaceC2332Q2.K(x.f7115c, (Y.e) this.f7075d);
                ArrayList arrayList4 = new ArrayList(K11.size());
                int size2 = K11.size();
                int i14 = 0;
                while (true) {
                    O o12 = (O) this.f7079v;
                    if (i14 >= size2) {
                        if (arrayList4.isEmpty()) {
                            obj4 = null;
                        } else {
                            obj4 = arrayList4.get(0);
                            int i15 = ((AbstractC2323H) obj4).f26555b;
                            int s10 = u0.s(arrayList4);
                            if (1 <= s10) {
                                Object obj10 = obj4;
                                int i16 = i15;
                                int i17 = 1;
                                while (true) {
                                    Object obj11 = arrayList4.get(i17);
                                    int i18 = ((AbstractC2323H) obj11).f26555b;
                                    if (i16 < i18) {
                                        obj10 = obj11;
                                        i16 = i18;
                                    }
                                    if (i17 != s10) {
                                        i17++;
                                    } else {
                                        obj4 = obj10;
                                    }
                                }
                            }
                        }
                        AbstractC2323H abstractC2323H2 = (AbstractC2323H) obj4;
                        int i19 = abstractC2323H2 != null ? abstractC2323H2.f26555b : 0;
                        if (arrayList4.isEmpty()) {
                            arrayList = arrayList4;
                            obj5 = null;
                        } else {
                            obj5 = arrayList4.get(0);
                            int i20 = ((AbstractC2323H) obj5).f26554a;
                            int s11 = u0.s(arrayList4);
                            if (1 <= s11) {
                                Object obj12 = obj5;
                                int i21 = i20;
                                int i22 = 1;
                                while (true) {
                                    Object obj13 = arrayList4.get(i22);
                                    arrayList = arrayList4;
                                    int i23 = ((AbstractC2323H) obj13).f26554a;
                                    if (i21 < i23) {
                                        i21 = i23;
                                        obj12 = obj13;
                                    }
                                    if (i22 != s11) {
                                        i22++;
                                        arrayList4 = arrayList;
                                    } else {
                                        obj5 = obj12;
                                    }
                                }
                            } else {
                                arrayList = arrayList4;
                            }
                        }
                        AbstractC2323H abstractC2323H3 = (AbstractC2323H) obj5;
                        int i24 = abstractC2323H3 != null ? abstractC2323H3.f26554a : 0;
                        List K12 = interfaceC2332Q2.K(x.f7116d, (Y.e) this.f7076e);
                        ArrayList arrayList5 = new ArrayList(K12.size());
                        int size3 = K12.size();
                        int i25 = 0;
                        while (i25 < size3) {
                            List list = K12;
                            int i26 = size3;
                            int i27 = g;
                            AbstractC2323H b2 = ((y0.z) K12.get(i25)).b(V0.b.h((-o12.d(interfaceC2332Q2, interfaceC2332Q2.getLayoutDirection())) - o12.c(interfaceC2332Q2, interfaceC2332Q2.getLayoutDirection()), -o12.a(interfaceC2332Q2), a10));
                            if (b2.f26555b == 0 || b2.f26554a == 0) {
                                b2 = null;
                            }
                            if (b2 != null) {
                                arrayList5.add(b2);
                            }
                            i25++;
                            K12 = list;
                            size3 = i26;
                            g = i27;
                        }
                        int i28 = g;
                        boolean isEmpty2 = arrayList5.isEmpty();
                        int i29 = this.f7073b;
                        if (isEmpty2) {
                            arrayList2 = arrayList5;
                            o10 = null;
                        } else {
                            if (arrayList5.isEmpty()) {
                                obj7 = null;
                            } else {
                                obj7 = arrayList5.get(0);
                                int i30 = ((AbstractC2323H) obj7).f26554a;
                                int s12 = u0.s(arrayList5);
                                if (1 <= s12) {
                                    int i31 = i30;
                                    int i32 = 1;
                                    while (true) {
                                        Object obj14 = arrayList5.get(i32);
                                        Object obj15 = obj7;
                                        int i33 = ((AbstractC2323H) obj14).f26554a;
                                        if (i31 < i33) {
                                            i31 = i33;
                                            obj7 = obj14;
                                        } else {
                                            obj7 = obj15;
                                        }
                                        if (i32 != s12) {
                                            i32++;
                                        }
                                    }
                                }
                            }
                            kotlin.jvm.internal.l.b(obj7);
                            int i34 = ((AbstractC2323H) obj7).f26554a;
                            if (arrayList5.isEmpty()) {
                                arrayList2 = arrayList5;
                                obj8 = null;
                            } else {
                                obj8 = arrayList5.get(0);
                                int i35 = ((AbstractC2323H) obj8).f26555b;
                                int s13 = u0.s(arrayList5);
                                if (1 <= s13) {
                                    int i36 = 1;
                                    Object obj16 = obj8;
                                    int i37 = i35;
                                    while (true) {
                                        Object obj17 = arrayList5.get(i36);
                                        arrayList2 = arrayList5;
                                        int i38 = ((AbstractC2323H) obj17).f26555b;
                                        if (i37 < i38) {
                                            i37 = i38;
                                            obj16 = obj17;
                                        }
                                        if (i36 != s13) {
                                            i36++;
                                            arrayList5 = arrayList2;
                                        } else {
                                            obj8 = obj16;
                                        }
                                    }
                                } else {
                                    arrayList2 = arrayList5;
                                }
                            }
                            kotlin.jvm.internal.l.b(obj8);
                            int i39 = ((AbstractC2323H) obj8).f26555b;
                            if (i29 != 0) {
                                if (i29 != 2 && i29 != 3) {
                                    B11 = (h10 - i34) / 2;
                                } else if (interfaceC2332Q2.getLayoutDirection() == V0.l.f9982a) {
                                    B12 = interfaceC2332Q2.B(w.f7112a);
                                    B11 = (h10 - B12) - i34;
                                } else {
                                    B11 = interfaceC2332Q2.B(w.f7112a);
                                }
                                o10 = new H2.O(B11, i39, 1);
                            } else if (interfaceC2332Q2.getLayoutDirection() == V0.l.f9982a) {
                                B11 = interfaceC2332Q2.B(w.f7112a);
                                o10 = new H2.O(B11, i39, 1);
                            } else {
                                B12 = interfaceC2332Q2.B(w.f7112a);
                                B11 = (h10 - B12) - i34;
                                o10 = new H2.O(B11, i39, 1);
                            }
                        }
                        int i40 = i24;
                        List K13 = interfaceC2332Q2.K(x.f7117e, new Y.e(-2146438447, new F.O((Y.e) this.f7077f), true));
                        ArrayList arrayList6 = new ArrayList(K13.size());
                        int size4 = K13.size();
                        for (int i41 = 0; i41 < size4; i41++) {
                            arrayList6.add(((y0.z) K13.get(i41)).b(a10));
                        }
                        if (arrayList6.isEmpty()) {
                            obj6 = null;
                        } else {
                            obj6 = arrayList6.get(0);
                            int i42 = ((AbstractC2323H) obj6).f26555b;
                            int s14 = u0.s(arrayList6);
                            int i43 = 1;
                            if (1 <= s14) {
                                while (true) {
                                    Object obj18 = arrayList6.get(i43);
                                    Object obj19 = obj6;
                                    int i44 = ((AbstractC2323H) obj18).f26555b;
                                    if (i42 < i44) {
                                        i42 = i44;
                                        obj6 = obj18;
                                    } else {
                                        obj6 = obj19;
                                    }
                                    if (i43 != s14) {
                                        i43++;
                                    }
                                }
                            }
                        }
                        AbstractC2323H abstractC2323H4 = (AbstractC2323H) obj6;
                        Integer valueOf = abstractC2323H4 != null ? Integer.valueOf(abstractC2323H4.f26555b) : null;
                        if (o10 != null) {
                            int i45 = o10.f4604c;
                            if (valueOf == null || i29 == 3) {
                                B10 = interfaceC2332Q2.B(w.f7112a) + i45;
                                a9 = o12.a(interfaceC2332Q2);
                            } else {
                                B10 = valueOf.intValue() + i45;
                                a9 = interfaceC2332Q2.B(w.f7112a);
                            }
                            num2 = Integer.valueOf(a9 + B10);
                        } else {
                            num2 = null;
                        }
                        int intValue = i19 != 0 ? i19 + (num2 != null ? num2.intValue() : valueOf != null ? valueOf.intValue() : o12.a(interfaceC2332Q2)) : 0;
                        H2.O o13 = o10;
                        List K14 = interfaceC2332Q2.K(x.f7114b, new Y.e(-1213360416, new s((O) this.f7079v, interfaceC2332Q2, arrayList3, i13, arrayList6, valueOf, (Y.e) this.f7078u), true));
                        ArrayList arrayList7 = new ArrayList(K14.size());
                        int size5 = K14.size();
                        for (int i46 = 0; i46 < size5; i46++) {
                            arrayList7.add(((y0.z) K14.get(i46)).b(a10));
                        }
                        return interfaceC2332Q2.Q(h10, i28, Eb.w.f3892a, new u(arrayList7, arrayList3, arrayList, arrayList6, o13, h10, i40, (O) this.f7079v, interfaceC2332Q2, i28, intValue, valueOf, arrayList2, num2));
                    }
                    arrayList4.add(((y0.z) K11.get(i14)).b(V0.b.h((-o12.d(interfaceC2332Q2, interfaceC2332Q2.getLayoutDirection())) - o12.c(interfaceC2332Q2, interfaceC2332Q2.getLayoutDirection()), -o12.a(interfaceC2332Q2), a10)));
                    i14++;
                }
                break;
            default:
                ((Number) obj2).intValue();
                androidx.compose.animation.a.b((i0) this.f7075d, (c0.m) this.f7076e, (Rb.c) this.f7077f, (c0.e) this.f7078u, (Rb.c) this.f7079v, this.f7074c, (C0506o) obj, C0480b.u(this.f7073b | 1));
                return Db.q.f3365a;
        }
    }
}
