package H4;

import B5.c;
import F4.b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import m4.K;
import m4.L;
import n5.D;

/* loaded from: classes.dex */
public final class a implements b {
    public static final Parcelable.Creator<a> CREATOR;

    /* renamed from: u, reason: collision with root package name */
    public static final L f4885u;

    /* renamed from: v, reason: collision with root package name */
    public static final L f4886v;

    /* renamed from: a, reason: collision with root package name */
    public final String f4887a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4888b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4889c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4890d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f4891e;

    /* renamed from: f, reason: collision with root package name */
    public int f4892f;

    static {
        K k = new K();
        k.k = "application/id3";
        f4885u = new L(k);
        K k7 = new K();
        k7.k = "application/x-scte35";
        f4886v = new L(k7);
        CREATOR = new c(14);
    }

    public a(Parcel parcel) {
        String readString = parcel.readString();
        int i7 = D.f21141a;
        this.f4887a = readString;
        this.f4888b = parcel.readString();
        this.f4889c = parcel.readLong();
        this.f4890d = parcel.readLong();
        this.f4891e = parcel.createByteArray();
    }

    public a(String str, String str2, long j, long j10, byte[] bArr) {
        this.f4887a = str;
        this.f4888b = str2;
        this.f4889c = j;
        this.f4890d = j10;
        this.f4891e = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f4889c == aVar.f4889c && this.f4890d == aVar.f4890d && D.a(this.f4887a, aVar.f4887a) && D.a(this.f4888b, aVar.f4888b) && Arrays.equals(this.f4891e, aVar.f4891e);
    }

    public final int hashCode() {
        if (this.f4892f == 0) {
            String str = this.f4887a;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f4888b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j = this.f4889c;
            int i7 = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j10 = this.f4890d;
            this.f4892f = Arrays.hashCode(this.f4891e) + ((i7 + ((int) (j10 ^ (j10 >>> 32)))) * 31);
        }
        return this.f4892f;
    }

    @Override // F4.b
    public final L o() {
        String str = this.f4887a;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c10 = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return f4886v;
            case 1:
            case 2:
                return f4885u;
            default:
                return null;
        }
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f4887a + ", id=" + this.f4890d + ", durationMs=" + this.f4889c + ", value=" + this.f4888b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f4887a);
        parcel.writeString(this.f4888b);
        parcel.writeLong(this.f4889c);
        parcel.writeLong(this.f4890d);
        parcel.writeByteArray(this.f4891e);
    }

    @Override // F4.b
    public final byte[] y() {
        if (o() != null) {
            return this.f4891e;
        }
        return null;
    }
}
