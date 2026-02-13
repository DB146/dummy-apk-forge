package e1;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d, reason: collision with root package name */
    public final o f16682d;

    /* renamed from: f, reason: collision with root package name */
    public int f16684f;
    public int g;

    /* renamed from: a, reason: collision with root package name */
    public o f16679a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f16680b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16681c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f16683e = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f16685h = 1;

    /* renamed from: i, reason: collision with root package name */
    public g f16686i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f16687l = new ArrayList();

    public f(o oVar) {
        this.f16682d = oVar;
    }

    @Override // e1.d
    public final void a(d dVar) {
        ArrayList arrayList = this.f16687l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).j) {
                return;
            }
        }
        this.f16681c = true;
        o oVar = this.f16679a;
        if (oVar != null) {
            oVar.a(this);
        }
        if (this.f16680b) {
            this.f16682d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        f fVar = null;
        int i7 = 0;
        while (it2.hasNext()) {
            f fVar2 = (f) it2.next();
            if (!(fVar2 instanceof g)) {
                i7++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i7 == 1 && fVar.j) {
            g gVar = this.f16686i;
            if (gVar != null) {
                if (!gVar.j) {
                    return;
                } else {
                    this.f16684f = this.f16685h * gVar.g;
                }
            }
            d(fVar.g + this.f16684f);
        }
        o oVar2 = this.f16679a;
        if (oVar2 != null) {
            oVar2.a(this);
        }
    }

    public final void b(o oVar) {
        this.k.add(oVar);
        if (this.j) {
            oVar.a(oVar);
        }
    }

    public final void c() {
        this.f16687l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.f16681c = false;
        this.f16680b = false;
    }

    public void d(int i7) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i7;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.a(dVar);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f16682d.f16700b.f16379h0);
        sb2.append(":");
        switch (this.f16683e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb2.append(str);
        sb2.append("(");
        sb2.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f16687l.size());
        sb2.append(":d=");
        sb2.append(this.k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
