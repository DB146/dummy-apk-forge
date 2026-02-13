package W1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: W1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0559b implements Parcelable {
    public static final Parcelable.Creator<C0559b> CREATOR = new U5.a0(14);

    /* renamed from: A, reason: collision with root package name */
    public final ArrayList f10430A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f10431B;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f10432a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f10433b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f10434c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f10435d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10436e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10437f;

    /* renamed from: u, reason: collision with root package name */
    public final int f10438u;

    /* renamed from: v, reason: collision with root package name */
    public final int f10439v;

    /* renamed from: w, reason: collision with root package name */
    public final CharSequence f10440w;

    /* renamed from: x, reason: collision with root package name */
    public final int f10441x;

    /* renamed from: y, reason: collision with root package name */
    public final CharSequence f10442y;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f10443z;

    public C0559b(C0558a c0558a) {
        int size = c0558a.f10409c.size();
        this.f10432a = new int[size * 6];
        if (!c0558a.f10414i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f10433b = new ArrayList(size);
        this.f10434c = new int[size];
        this.f10435d = new int[size];
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            c0 c0Var = (c0) c0558a.f10409c.get(i10);
            int i11 = i7 + 1;
            this.f10432a[i7] = c0Var.f10452a;
            ArrayList arrayList = this.f10433b;
            C c10 = c0Var.f10453b;
            arrayList.add(c10 != null ? c10.f10293f : null);
            int[] iArr = this.f10432a;
            iArr[i11] = c0Var.f10454c ? 1 : 0;
            iArr[i7 + 2] = c0Var.f10455d;
            iArr[i7 + 3] = c0Var.f10456e;
            int i12 = i7 + 5;
            iArr[i7 + 4] = c0Var.f10457f;
            i7 += 6;
            iArr[i12] = c0Var.g;
            this.f10434c[i10] = c0Var.f10458h.ordinal();
            this.f10435d[i10] = c0Var.f10459i.ordinal();
        }
        this.f10436e = c0558a.f10413h;
        this.f10437f = c0558a.k;
        this.f10438u = c0558a.f10424u;
        this.f10439v = c0558a.f10415l;
        this.f10440w = c0558a.f10416m;
        this.f10441x = c0558a.f10417n;
        this.f10442y = c0558a.f10418o;
        this.f10443z = c0558a.f10419p;
        this.f10430A = c0558a.f10420q;
        this.f10431B = c0558a.f10421r;
    }

    public C0559b(Parcel parcel) {
        this.f10432a = parcel.createIntArray();
        this.f10433b = parcel.createStringArrayList();
        this.f10434c = parcel.createIntArray();
        this.f10435d = parcel.createIntArray();
        this.f10436e = parcel.readInt();
        this.f10437f = parcel.readString();
        this.f10438u = parcel.readInt();
        this.f10439v = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f10440w = (CharSequence) creator.createFromParcel(parcel);
        this.f10441x = parcel.readInt();
        this.f10442y = (CharSequence) creator.createFromParcel(parcel);
        this.f10443z = parcel.createStringArrayList();
        this.f10430A = parcel.createStringArrayList();
        this.f10431B = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeIntArray(this.f10432a);
        parcel.writeStringList(this.f10433b);
        parcel.writeIntArray(this.f10434c);
        parcel.writeIntArray(this.f10435d);
        parcel.writeInt(this.f10436e);
        parcel.writeString(this.f10437f);
        parcel.writeInt(this.f10438u);
        parcel.writeInt(this.f10439v);
        TextUtils.writeToParcel(this.f10440w, parcel, 0);
        parcel.writeInt(this.f10441x);
        TextUtils.writeToParcel(this.f10442y, parcel, 0);
        parcel.writeStringList(this.f10443z);
        parcel.writeStringList(this.f10430A);
        parcel.writeInt(this.f10431B ? 1 : 0);
    }
}
