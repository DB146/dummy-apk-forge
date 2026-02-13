package y5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.Map;
import u.C2052e;
import u.T;

/* renamed from: y5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2391d extends zzbz {
    public static final Parcelable.Creator<C2391d> CREATOR = new C2392e(0);

    /* renamed from: u, reason: collision with root package name */
    public static final C2052e f26971u;

    /* renamed from: a, reason: collision with root package name */
    public final int f26972a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f26973b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f26974c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f26975d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f26976e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f26977f;

    /* JADX WARN: Type inference failed for: r0v1, types: [u.T, u.e] */
    static {
        ?? t5 = new T(0);
        f26971u = t5;
        t5.put("registered", K5.a.t(2, "registered"));
        t5.put("in_progress", K5.a.t(3, "in_progress"));
        t5.put("success", K5.a.t(4, "success"));
        t5.put("failed", K5.a.t(5, "failed"));
        t5.put("escrowed", K5.a.t(6, "escrowed"));
    }

    public C2391d(int i7, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        this.f26972a = i7;
        this.f26973b = arrayList;
        this.f26974c = arrayList2;
        this.f26975d = arrayList3;
        this.f26976e = arrayList4;
        this.f26977f = arrayList5;
    }

    @Override // K5.b
    public final Map getFieldMappings() {
        return f26971u;
    }

    @Override // K5.b
    public final Object getFieldValue(K5.a aVar) {
        switch (aVar.f6163u) {
            case 1:
                return Integer.valueOf(this.f26972a);
            case 2:
                return this.f26973b;
            case 3:
                return this.f26974c;
            case 4:
                return this.f26975d;
            case 5:
                return this.f26976e;
            case 6:
                return this.f26977f;
            default:
                throw new IllegalStateException("Unknown SafeParcelable id=" + aVar.f6163u);
        }
    }

    @Override // K5.b
    public final boolean isFieldSet(K5.a aVar) {
        return true;
    }

    @Override // K5.b
    public final void setStringsInternal(K5.a aVar, String str, ArrayList arrayList) {
        int i7 = aVar.f6163u;
        if (i7 == 2) {
            this.f26973b = arrayList;
            return;
        }
        if (i7 == 3) {
            this.f26974c = arrayList;
            return;
        }
        if (i7 == 4) {
            this.f26975d = arrayList;
        } else if (i7 == 5) {
            this.f26976e = arrayList;
        } else {
            if (i7 != 6) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", Integer.valueOf(i7)));
            }
            this.f26977f = arrayList;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f26972a);
        com.bumptech.glide.d.J(parcel, 2, this.f26973b);
        com.bumptech.glide.d.J(parcel, 3, this.f26974c);
        com.bumptech.glide.d.J(parcel, 4, this.f26975d);
        com.bumptech.glide.d.J(parcel, 5, this.f26976e);
        com.bumptech.glide.d.J(parcel, 6, this.f26977f);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
