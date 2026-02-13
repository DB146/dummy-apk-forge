package o7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.internal.p002firebaseauthapi.zzahn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n7.F;
import n7.InterfaceC1709A;

/* renamed from: o7.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1815e extends n7.l {
    public static final Parcelable.Creator<C1815e> CREATOR = new C1812b(1);

    /* renamed from: A, reason: collision with root package name */
    public List f22068A;

    /* renamed from: a, reason: collision with root package name */
    public zzahn f22069a;

    /* renamed from: b, reason: collision with root package name */
    public C1813c f22070b;

    /* renamed from: c, reason: collision with root package name */
    public String f22071c;

    /* renamed from: d, reason: collision with root package name */
    public String f22072d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f22073e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f22074f;

    /* renamed from: u, reason: collision with root package name */
    public String f22075u;

    /* renamed from: v, reason: collision with root package name */
    public Boolean f22076v;

    /* renamed from: w, reason: collision with root package name */
    public C1816f f22077w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f22078x;

    /* renamed from: y, reason: collision with root package name */
    public F f22079y;

    /* renamed from: z, reason: collision with root package name */
    public m f22080z;

    public C1815e(Y6.i iVar, ArrayList arrayList) {
        iVar.b();
        this.f22071c = iVar.f12042b;
        this.f22072d = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f22075u = "2";
        C(arrayList);
    }

    @Override // n7.l
    public final synchronized C1815e C(ArrayList arrayList) {
        try {
            G.g(arrayList);
            this.f22073e = new ArrayList(arrayList.size());
            this.f22074f = new ArrayList(arrayList.size());
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                InterfaceC1709A interfaceC1709A = (InterfaceC1709A) arrayList.get(i7);
                if (interfaceC1709A.b().equals("firebase")) {
                    this.f22070b = (C1813c) interfaceC1709A;
                } else {
                    this.f22074f.add(interfaceC1709A.b());
                }
                this.f22073e.add((C1813c) interfaceC1709A);
            }
            if (this.f22070b == null) {
                this.f22070b = (C1813c) this.f22073e.get(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // n7.l
    public final void D(ArrayList arrayList) {
        m mVar;
        if (arrayList.isEmpty()) {
            mVar = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                n7.q qVar = (n7.q) it.next();
                if (qVar instanceof n7.v) {
                    arrayList2.add((n7.v) qVar);
                } else if (qVar instanceof n7.y) {
                    arrayList3.add((n7.y) qVar);
                }
            }
            mVar = new m(arrayList2, arrayList3);
        }
        this.f22080z = mVar;
    }

    @Override // n7.InterfaceC1709A
    public final String b() {
        return this.f22070b.f22061b;
    }

    @Override // n7.l
    public final String t() {
        Map map;
        zzahn zzahnVar = this.f22069a;
        if (zzahnVar == null || zzahnVar.zzc() == null || (map = (Map) AbstractC1822l.a(this.f22069a.zzc()).f21292b.get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.G(parcel, 1, this.f22069a, i7, false);
        com.bumptech.glide.d.G(parcel, 2, this.f22070b, i7, false);
        com.bumptech.glide.d.H(parcel, 3, this.f22071c, false);
        com.bumptech.glide.d.H(parcel, 4, this.f22072d, false);
        com.bumptech.glide.d.L(parcel, 5, this.f22073e, false);
        com.bumptech.glide.d.J(parcel, 6, this.f22074f);
        com.bumptech.glide.d.H(parcel, 7, this.f22075u, false);
        com.bumptech.glide.d.y(parcel, 8, Boolean.valueOf(z()));
        com.bumptech.glide.d.G(parcel, 9, this.f22077w, i7, false);
        boolean z8 = this.f22078x;
        com.bumptech.glide.d.O(parcel, 10, 4);
        parcel.writeInt(z8 ? 1 : 0);
        com.bumptech.glide.d.G(parcel, 11, this.f22079y, i7, false);
        com.bumptech.glide.d.G(parcel, 12, this.f22080z, i7, false);
        com.bumptech.glide.d.L(parcel, 13, this.f22068A, false);
        com.bumptech.glide.d.N(M3, parcel);
    }

    @Override // n7.l
    public final boolean z() {
        String str;
        Boolean bool = this.f22076v;
        if (bool == null || bool.booleanValue()) {
            zzahn zzahnVar = this.f22069a;
            if (zzahnVar != null) {
                Map map = (Map) AbstractC1822l.a(zzahnVar.zzc()).f21292b.get("firebase");
                str = map != null ? (String) map.get("sign_in_provider") : null;
            } else {
                str = "";
            }
            boolean z8 = true;
            if (this.f22073e.size() > 1 || (str != null && str.equals("custom"))) {
                z8 = false;
            }
            this.f22076v = Boolean.valueOf(z8);
        }
        return this.f22076v.booleanValue();
    }
}
