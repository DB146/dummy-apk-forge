package A9;

import android.database.Observable;
import i2.C1333u;

/* loaded from: classes2.dex */
public final class I1 extends Observable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f839a;

    public /* synthetic */ I1(int i7) {
        this.f839a = i7;
    }

    public boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        switch (this.f839a) {
            case 0:
                for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                    ((Z) ((Observable) this).mObservers.get(size)).a();
                }
                return;
            case 1:
                for (int size2 = ((Observable) this).mObservers.size() - 1; size2 >= 0; size2--) {
                    ((H2.L) ((Observable) this).mObservers.get(size2)).a();
                }
                return;
            default:
                for (int size3 = ((Observable) this).mObservers.size() - 1; size3 >= 0; size3--) {
                    ((C1333u) ((Observable) this).mObservers.get(size3)).f18305a.d();
                }
                return;
        }
    }

    public void c(int i7, int i10) {
        switch (this.f839a) {
            case 0:
                for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                    Z z8 = (Z) ((Observable) this).mObservers.get(size);
                    switch (z8.f1040a) {
                        case 1:
                            ((C0135s1) z8.f1041b).f4599a.c(i7, i10);
                            break;
                        default:
                            z8.a();
                            break;
                    }
                }
                return;
            default:
                for (int size2 = ((Observable) this).mObservers.size() - 1; size2 >= 0; size2--) {
                    ((H2.L) ((Observable) this).mObservers.get(size2)).d(i7, i10);
                }
                return;
        }
    }

    public void d(int i7) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((C1333u) ((Observable) this).mObservers.get(size)).f18305a.f4599a.f(null, 0, i7);
        }
    }

    public void e(int i7, int i10) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            Z z8 = (Z) ((Observable) this).mObservers.get(size);
            switch (z8.f1040a) {
                case 0:
                    C0067b0 c0067b0 = (C0067b0) z8.f1041b;
                    C0098j c0098j = c0067b0.f1058b;
                    for (int i11 = 0; i11 < i10; i11++) {
                        c0067b0.c(i7 + i11, c0067b0.f1058b, c0067b0.f1060d);
                    }
                    break;
                case 1:
                    ((C0135s1) z8.f1041b).f4599a.f(null, i7, i10);
                    break;
                default:
                    int i12 = ((C0143u1) z8.f1041b).f1407d;
                    if (i7 <= i12) {
                        z8.b(2, i7, Math.min(i10, (i12 - i7) + 1));
                        break;
                    } else {
                        break;
                    }
            }
        }
    }

    public void f(Object obj, int i7, int i10) {
        switch (this.f839a) {
            case 0:
                for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                    Z z8 = (Z) ((Observable) this).mObservers.get(size);
                    switch (z8.f1040a) {
                        case 1:
                            ((C0135s1) z8.f1041b).f4599a.f(obj, i7, i10);
                            break;
                        default:
                            z8.a();
                            break;
                    }
                }
                return;
            default:
                for (int size2 = ((Observable) this).mObservers.size() - 1; size2 >= 0; size2--) {
                    ((H2.L) ((Observable) this).mObservers.get(size2)).b(obj, i7, i10);
                }
                return;
        }
    }

    public void g(int i7) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((C1333u) ((Observable) this).mObservers.get(size)).f18305a.f4599a.h(i7, 1);
        }
    }

    public void h(int i7, int i10) {
        switch (this.f839a) {
            case 0:
                for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                    Z z8 = (Z) ((Observable) this).mObservers.get(size);
                    switch (z8.f1040a) {
                        case 1:
                            ((C0135s1) z8.f1041b).f4599a.h(i7, i10);
                            break;
                        case 2:
                            C0143u1 c0143u1 = (C0143u1) z8.f1041b;
                            int i11 = c0143u1.f1407d;
                            if (i7 <= i11) {
                                c0143u1.f1407d = i11 + i10;
                                z8.b(4, i7, i10);
                                break;
                            } else {
                                c0143u1.f();
                                int i12 = c0143u1.f1407d;
                                if (i12 > i11) {
                                    z8.b(4, i11 + 1, i12 - i11);
                                    break;
                                } else {
                                    break;
                                }
                            }
                        default:
                            z8.a();
                            break;
                    }
                }
                return;
            default:
                for (int size2 = ((Observable) this).mObservers.size() - 1; size2 >= 0; size2--) {
                    ((H2.L) ((Observable) this).mObservers.get(size2)).c(i7, i10);
                }
                return;
        }
    }

    public void i(int i7, int i10) {
        switch (this.f839a) {
            case 0:
                for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                    Z z8 = (Z) ((Observable) this).mObservers.get(size);
                    switch (z8.f1040a) {
                        case 1:
                            ((C0135s1) z8.f1041b).f4599a.i(i7, i10);
                            break;
                        case 2:
                            int i11 = (i7 + i10) - 1;
                            C0143u1 c0143u1 = (C0143u1) z8.f1041b;
                            int i12 = c0143u1.f1407d;
                            if (i11 < i12) {
                                c0143u1.f1407d = i12 - i10;
                                z8.b(8, i7, i10);
                                break;
                            } else {
                                c0143u1.f();
                                int i13 = c0143u1.f1407d;
                                int i14 = i12 - i13;
                                if (i14 > 0) {
                                    z8.b(8, Math.min(i13 + 1, i7), i14);
                                    break;
                                } else {
                                    break;
                                }
                            }
                        default:
                            z8.a();
                            break;
                    }
                }
                return;
            default:
                for (int size2 = ((Observable) this).mObservers.size() - 1; size2 >= 0; size2--) {
                    ((H2.L) ((Observable) this).mObservers.get(size2)).e(i7, i10);
                }
                return;
        }
    }
}
