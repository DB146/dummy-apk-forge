package T4;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import n5.D;

/* loaded from: classes.dex */
public final class c implements O4.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f9247a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9248b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9249c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9250d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9251e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9252f;
    public final long g;

    /* renamed from: h, reason: collision with root package name */
    public final long f9253h;

    /* renamed from: i, reason: collision with root package name */
    public final u f9254i;
    public final t j;
    public final Uri k;

    /* renamed from: l, reason: collision with root package name */
    public final i f9255l;

    /* renamed from: m, reason: collision with root package name */
    public final List f9256m;

    public c(long j, long j10, long j11, boolean z8, long j12, long j13, long j14, long j15, i iVar, u uVar, t tVar, Uri uri, ArrayList arrayList) {
        this.f9247a = j;
        this.f9248b = j10;
        this.f9249c = j11;
        this.f9250d = z8;
        this.f9251e = j12;
        this.f9252f = j13;
        this.g = j14;
        this.f9253h = j15;
        this.f9255l = iVar;
        this.f9254i = uVar;
        this.k = uri;
        this.j = tVar;
        this.f9256m = arrayList;
    }

    @Override // O4.a
    public final Object a(List list) {
        ArrayList arrayList;
        long j;
        ArrayList arrayList2;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new O4.b(-1, -1, -1));
        ArrayList arrayList3 = new ArrayList();
        long j10 = 0;
        int i7 = 0;
        while (true) {
            if (i7 >= this.f9256m.size()) {
                break;
            }
            if (((O4.b) linkedList.peek()).f7472a != i7) {
                long c10 = c(i7);
                if (c10 != -9223372036854775807L) {
                    j10 += c10;
                }
                j = j10;
                arrayList2 = arrayList3;
            } else {
                h b2 = b(i7);
                List list2 = b2.f9278c;
                O4.b bVar = (O4.b) linkedList.poll();
                int i10 = bVar.f7472a;
                ArrayList arrayList4 = new ArrayList();
                while (true) {
                    int i11 = bVar.f7473b;
                    a aVar = (a) list2.get(i11);
                    List list3 = aVar.f9239c;
                    ArrayList arrayList5 = new ArrayList();
                    do {
                        arrayList5.add((m) list3.get(bVar.f7474c));
                        bVar = (O4.b) linkedList.poll();
                        if (bVar.f7472a != i10) {
                            break;
                        }
                    } while (bVar.f7473b == i11);
                    arrayList = arrayList3;
                    j = j10;
                    arrayList4.add(new a(aVar.f9237a, aVar.f9238b, arrayList5, aVar.f9240d, aVar.f9241e, aVar.f9242f));
                    if (bVar.f7472a != i10) {
                        break;
                    }
                    arrayList3 = arrayList;
                    j10 = j;
                }
                linkedList.addFirst(bVar);
                arrayList2 = arrayList;
                arrayList2.add(new h(b2.f9276a, b2.f9277b - j, arrayList4, b2.f9279d));
            }
            i7++;
            arrayList3 = arrayList2;
            j10 = j;
        }
        long j11 = j10;
        ArrayList arrayList6 = arrayList3;
        long j12 = this.f9248b;
        return new c(this.f9247a, j12 != -9223372036854775807L ? j12 - j11 : -9223372036854775807L, this.f9249c, this.f9250d, this.f9251e, this.f9252f, this.g, this.f9253h, this.f9255l, this.f9254i, this.j, this.k, arrayList6);
    }

    public final h b(int i7) {
        return (h) this.f9256m.get(i7);
    }

    public final long c(int i7) {
        long j;
        long j10;
        List list = this.f9256m;
        if (i7 == list.size() - 1) {
            j = this.f9248b;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j10 = ((h) list.get(i7)).f9277b;
        } else {
            j = ((h) list.get(i7 + 1)).f9277b;
            j10 = ((h) list.get(i7)).f9277b;
        }
        return j - j10;
    }

    public final long d(int i7) {
        return D.M(c(i7));
    }
}
