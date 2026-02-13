package D9;

import h2.C1233a;
import h2.C1234b;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3301a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3302b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3303c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f3304d;

    public d(int i7) {
        this.f3301a = i7;
        switch (i7) {
            case 1:
                this.f3302b = new ArrayList();
                this.f3303c = new ArrayList();
                this.f3304d = new ArrayList();
                return;
            default:
                this.f3302b = new ArrayList();
                this.f3303c = new ArrayList();
                this.f3304d = new ArrayList();
                return;
        }
    }

    public static void c(b bVar, b bVar2) {
        c cVar = new c(bVar, bVar2);
        bVar2.a(cVar);
        bVar.b(cVar);
    }

    public static void d(b bVar, b bVar2, a aVar) {
        c cVar = new c(bVar, bVar2, aVar);
        bVar2.a(cVar);
        bVar.b(cVar);
    }

    public static void e(C1233a c1233a, C1233a c1233a2) {
        C1234b c1234b = new C1234b(c1233a, c1233a2);
        c1233a2.a(c1234b);
        c1233a.b(c1234b);
    }

    public static void f(C1233a c1233a, C1233a c1233a2, a aVar) {
        C1234b c1234b = new C1234b(c1233a, c1233a2, aVar);
        c1233a2.a(c1234b);
        c1233a.b(c1234b);
    }

    public void a(b bVar) {
        ArrayList arrayList = this.f3302b;
        if (arrayList.contains(bVar)) {
            return;
        }
        arrayList.add(bVar);
    }

    public void b(C1233a c1233a) {
        ArrayList arrayList = this.f3302b;
        if (arrayList.contains(c1233a)) {
            return;
        }
        arrayList.add(c1233a);
    }

    public void g(a aVar) {
        boolean z8;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f3303c;
            if (i7 >= arrayList.size()) {
                i();
                return;
            }
            b bVar = (b) arrayList.get(i7);
            ArrayList arrayList2 = bVar.g;
            if (arrayList2 != null && ((z8 = bVar.f3291b) || bVar.f3294e <= 0)) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    c cVar = (c) it.next();
                    if (cVar.f3300e != 1 && cVar.f3298c == aVar) {
                        cVar.f3300e = 1;
                        bVar.f3294e++;
                        if (!z8) {
                            break;
                        }
                    }
                }
            }
            i7++;
        }
    }

    public void h(a aVar) {
        boolean z8;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f3303c;
            if (i7 >= arrayList.size()) {
                i();
                return;
            }
            C1233a c1233a = (C1233a) arrayList.get(i7);
            ArrayList arrayList2 = c1233a.g;
            if (arrayList2 != null && ((z8 = c1233a.f17640b) || c1233a.f17643e <= 0)) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    C1234b c1234b = (C1234b) it.next();
                    if (c1234b.f17649e != 1 && c1234b.f17647c == aVar) {
                        c1234b.f17649e = 1;
                        c1233a.f17643e++;
                        if (!z8) {
                            break;
                        }
                    }
                }
            }
            i7++;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    public final void i() {
        boolean z8;
        boolean z10;
        switch (this.f3301a) {
            case 0:
                do {
                    ArrayList arrayList = this.f3304d;
                    z8 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        b bVar = (b) arrayList.get(size);
                        if (bVar.f3293d != 1) {
                            ArrayList arrayList2 = bVar.f3295f;
                            if (arrayList2 != null) {
                                if (bVar.f3292c) {
                                    Iterator it = arrayList2.iterator();
                                    while (it.hasNext()) {
                                        if (((c) it.next()).f3300e != 1) {
                                            break;
                                        }
                                    }
                                } else {
                                    Iterator it2 = arrayList2.iterator();
                                    while (it2.hasNext()) {
                                        if (((c) it2.next()).f3300e == 1) {
                                        }
                                    }
                                }
                            }
                            bVar.f3293d = 1;
                            bVar.c();
                            ArrayList arrayList3 = bVar.g;
                            if (arrayList3 != null) {
                                Iterator it3 = arrayList3.iterator();
                                while (it3.hasNext()) {
                                    c cVar = (c) it3.next();
                                    if (cVar.f3298c == null && cVar.f3299d == null) {
                                        bVar.f3294e++;
                                        cVar.f3300e = 1;
                                        if (!bVar.f3291b) {
                                        }
                                    }
                                }
                            }
                            arrayList.remove(size);
                            this.f3303c.add(bVar);
                            z8 = true;
                        }
                    }
                } while (z8);
                return;
            default:
                do {
                    ArrayList arrayList4 = this.f3304d;
                    z10 = false;
                    for (int size2 = arrayList4.size() - 1; size2 >= 0; size2--) {
                        C1233a c1233a = (C1233a) arrayList4.get(size2);
                        if (c1233a.f17642d != 1) {
                            ArrayList arrayList5 = c1233a.f17644f;
                            if (arrayList5 != null) {
                                if (c1233a.f17641c) {
                                    Iterator it4 = arrayList5.iterator();
                                    while (it4.hasNext()) {
                                        if (((C1234b) it4.next()).f17649e != 1) {
                                            break;
                                        }
                                    }
                                } else {
                                    Iterator it5 = arrayList5.iterator();
                                    while (it5.hasNext()) {
                                        if (((C1234b) it5.next()).f17649e == 1) {
                                        }
                                    }
                                }
                            }
                            c1233a.f17642d = 1;
                            c1233a.c();
                            ArrayList arrayList6 = c1233a.g;
                            if (arrayList6 != null) {
                                Iterator it6 = arrayList6.iterator();
                                while (it6.hasNext()) {
                                    C1234b c1234b = (C1234b) it6.next();
                                    if (c1234b.f17647c == null && c1234b.f17648d == null) {
                                        c1233a.f17643e++;
                                        c1234b.f17649e = 1;
                                        if (!c1233a.f17640b) {
                                        }
                                    }
                                }
                            }
                            arrayList4.remove(size2);
                            this.f3303c.add(c1233a);
                            z10 = true;
                        }
                    }
                } while (z10);
                return;
        }
    }
}
