package Eb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class G extends Jb.h implements Rb.e {

    /* renamed from: b, reason: collision with root package name */
    public Object f3863b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f3864c;

    /* renamed from: d, reason: collision with root package name */
    public int f3865d;

    /* renamed from: e, reason: collision with root package name */
    public int f3866e;

    /* renamed from: f, reason: collision with root package name */
    public int f3867f;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3868u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Iterator f3869v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(Iterator it, Hb.d dVar) {
        super(dVar);
        this.f3869v = it;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        G g = new G(this.f3869v, dVar);
        g.f3868u = obj;
        return g;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((G) create((Zb.h) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        int i7;
        int i10;
        ArrayList arrayList;
        Iterator it;
        int i11;
        int i12;
        int i13;
        F f4;
        Object[] array;
        Zb.h hVar = (Zb.h) this.f3868u;
        Ib.a aVar = Ib.a.f5345a;
        int i14 = this.f3867f;
        if (i14 == 0) {
            com.bumptech.glide.c.c0(obj);
            Iterator it2 = this.f3869v;
            i7 = 0;
            i10 = 0;
            arrayList = new ArrayList(20);
            it = it2;
            i11 = 20;
        } else {
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 == 3) {
                        int i15 = this.f3866e;
                        int i16 = this.f3865d;
                        Iterator it3 = this.f3864c;
                        F f10 = (F) this.f3863b;
                        com.bumptech.glide.c.c0(obj);
                        f10.o();
                        while (it3.hasNext()) {
                            Object next = it3.next();
                            int b2 = f10.b();
                            int i17 = f10.f3860b;
                            if (b2 == i17) {
                                throw new IllegalStateException("ring buffer is full");
                            }
                            int i18 = f10.f3861c;
                            int i19 = f10.f3862d;
                            Object[] objArr = f10.f3859a;
                            objArr[(i18 + i19) % i17] = next;
                            f10.f3862d = i19 + 1;
                            if (f10.b() == i17) {
                                if (f10.f3862d >= 20) {
                                    ArrayList arrayList2 = new ArrayList(f10);
                                    this.f3868u = hVar;
                                    this.f3863b = f10;
                                    this.f3864c = it3;
                                    this.f3865d = i16;
                                    this.f3866e = i15;
                                    this.f3867f = 3;
                                    hVar.c(this, arrayList2);
                                    Ib.a aVar2 = Ib.a.f5345a;
                                    return aVar;
                                }
                                int i20 = i17 + (i17 >> 1) + 1;
                                if (i20 > 20) {
                                    i20 = 20;
                                }
                                if (f10.f3861c == 0) {
                                    array = Arrays.copyOf(objArr, i20);
                                    kotlin.jvm.internal.l.d(array, "copyOf(...)");
                                } else {
                                    array = f10.toArray(new Object[i20]);
                                }
                                f10 = new F(array, f10.f3862d);
                            }
                        }
                        i12 = i15;
                        i13 = i16;
                        f4 = f10;
                    } else if (i14 == 4) {
                        i12 = this.f3866e;
                        i13 = this.f3865d;
                        f4 = (F) this.f3863b;
                        com.bumptech.glide.c.c0(obj);
                        f4.o();
                    } else {
                        if (i14 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    if (f4.f3862d > 20) {
                        ArrayList arrayList3 = new ArrayList(f4);
                        this.f3868u = hVar;
                        this.f3863b = f4;
                        this.f3864c = null;
                        this.f3865d = i13;
                        this.f3866e = i12;
                        this.f3867f = 4;
                        hVar.c(this, arrayList3);
                        Ib.a aVar3 = Ib.a.f5345a;
                        return aVar;
                    }
                    if (!f4.isEmpty()) {
                        this.f3868u = null;
                        this.f3863b = null;
                        this.f3864c = null;
                        this.f3865d = i13;
                        this.f3866e = i12;
                        this.f3867f = 5;
                        hVar.c(this, f4);
                        Ib.a aVar4 = Ib.a.f5345a;
                        return aVar;
                    }
                    return Db.q.f3365a;
                }
                com.bumptech.glide.c.c0(obj);
                return Db.q.f3365a;
            }
            i7 = this.f3866e;
            int i21 = this.f3865d;
            Iterator it4 = this.f3864c;
            com.bumptech.glide.c.c0(obj);
            arrayList = new ArrayList(20);
            it = it4;
            i11 = i21;
            i10 = i7;
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            if (i7 > 0) {
                i7--;
            } else {
                arrayList.add(next2);
                if (arrayList.size() == 20) {
                    this.f3868u = hVar;
                    this.f3863b = arrayList;
                    this.f3864c = it;
                    this.f3865d = i11;
                    this.f3866e = i10;
                    this.f3867f = 1;
                    hVar.c(this, arrayList);
                    Ib.a aVar5 = Ib.a.f5345a;
                    return aVar;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f3868u = null;
            this.f3863b = null;
            this.f3864c = null;
            this.f3865d = i11;
            this.f3866e = i10;
            this.f3867f = 2;
            hVar.c(this, arrayList);
            Ib.a aVar6 = Ib.a.f5345a;
            return aVar;
        }
        return Db.q.f3365a;
    }
}
