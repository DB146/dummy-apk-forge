package ac;

import Db.q;
import Q.C0480b;
import Q.C0506o;
import h3.H;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import w2.r;

/* loaded from: classes2.dex */
public final /* synthetic */ class o implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12835a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12836b;

    public /* synthetic */ o(Object obj, int i7) {
        this.f12835a = i7;
        this.f12836b = obj;
    }

    public /* synthetic */ o(r rVar, int i7) {
        this.f12835a = 2;
        this.f12836b = rVar;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        int i7;
        int i10;
        Object obj3;
        Db.j jVar;
        Object obj4;
        switch (this.f12835a) {
            case 0:
                CharSequence DelimitedRangesSequence = (CharSequence) obj;
                int intValue = ((Integer) obj2).intValue();
                kotlin.jvm.internal.l.e(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
                int g02 = g.g0(DelimitedRangesSequence, (char[]) this.f12836b, intValue, false);
                if (g02 < 0) {
                    return null;
                }
                return new Db.j(Integer.valueOf(g02), 1);
            case 1:
                CharSequence DelimitedRangesSequence2 = (CharSequence) obj;
                int intValue2 = ((Integer) obj2).intValue();
                kotlin.jvm.internal.l.e(DelimitedRangesSequence2, "$this$DelimitedRangesSequence");
                List list = (List) this.f12836b;
                if (list.size() == 1) {
                    int size = list.size();
                    if (size == 0) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    if (size != 1) {
                        throw new IllegalArgumentException("List has more than one element.");
                    }
                    String str = (String) list.get(0);
                    int f02 = g.f0(DelimitedRangesSequence2, str, intValue2, 4);
                    if (f02 >= 0) {
                        jVar = new Db.j(Integer.valueOf(f02), str);
                    }
                    jVar = null;
                } else {
                    if (intValue2 < 0) {
                        intValue2 = 0;
                    }
                    Xb.e eVar = new Xb.e(intValue2, DelimitedRangesSequence2.length(), 1);
                    boolean z8 = DelimitedRangesSequence2 instanceof String;
                    int i11 = eVar.f11027c;
                    int i12 = eVar.f11026b;
                    if (z8) {
                        if ((i11 > 0 && intValue2 <= i12) || (i11 < 0 && i12 <= intValue2)) {
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj4 = it.next();
                                        String str2 = (String) obj4;
                                        if (n.U(0, intValue2, str2.length(), str2, (String) DelimitedRangesSequence2, false)) {
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                }
                                String str3 = (String) obj4;
                                if (str3 != null) {
                                    jVar = new Db.j(Integer.valueOf(intValue2), str3);
                                } else if (intValue2 != i12) {
                                    intValue2 += i11;
                                }
                            }
                        }
                        jVar = null;
                    } else {
                        if ((i11 > 0 && intValue2 <= i12) || (i11 < 0 && i12 <= intValue2)) {
                            int i13 = intValue2;
                            while (true) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj3 = it2.next();
                                        String str4 = (String) obj3;
                                        i7 = i12;
                                        i10 = i11;
                                        if (!g.m0(str4, 0, DelimitedRangesSequence2, i13, str4.length(), false)) {
                                            i11 = i10;
                                            i12 = i7;
                                        }
                                    } else {
                                        i7 = i12;
                                        i10 = i11;
                                        obj3 = null;
                                    }
                                }
                                String str5 = (String) obj3;
                                if (str5 != null) {
                                    jVar = new Db.j(Integer.valueOf(i13), str5);
                                } else if (i13 != i7) {
                                    i13 += i10;
                                    i11 = i10;
                                    i12 = i7;
                                }
                            }
                        }
                        jVar = null;
                    }
                }
                if (jVar == null) {
                    return null;
                }
                return new Db.j(jVar.f3354a, Integer.valueOf(((String) jVar.f3355b).length()));
            default:
                ((Integer) obj2).getClass();
                H.d((r) this.f12836b, (C0506o) obj, C0480b.u(1));
                return q.f3365a;
        }
    }
}
