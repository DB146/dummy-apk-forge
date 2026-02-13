package M4;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final long f6769a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6770b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6771c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6772d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6773e;

    /* renamed from: f, reason: collision with root package name */
    public final List f6774f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final long f6775h;

    /* renamed from: i, reason: collision with root package name */
    public final int f6776i;
    public final int j;
    public final int k;

    public h(long j, boolean z8, boolean z10, boolean z11, ArrayList arrayList, long j10, boolean z12, long j11, int i7, int i10, int i11) {
        this.f6769a = j;
        this.f6770b = z8;
        this.f6771c = z10;
        this.f6772d = z11;
        this.f6774f = Collections.unmodifiableList(arrayList);
        this.f6773e = j10;
        this.g = z12;
        this.f6775h = j11;
        this.f6776i = i7;
        this.j = i10;
        this.k = i11;
    }

    public h(Parcel parcel) {
        this.f6769a = parcel.readLong();
        this.f6770b = parcel.readByte() == 1;
        this.f6771c = parcel.readByte() == 1;
        this.f6772d = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i7 = 0; i7 < readInt; i7++) {
            arrayList.add(new g(parcel.readInt(), parcel.readLong()));
        }
        this.f6774f = Collections.unmodifiableList(arrayList);
        this.f6773e = parcel.readLong();
        this.g = parcel.readByte() == 1;
        this.f6775h = parcel.readLong();
        this.f6776i = parcel.readInt();
        this.j = parcel.readInt();
        this.k = parcel.readInt();
    }
}
