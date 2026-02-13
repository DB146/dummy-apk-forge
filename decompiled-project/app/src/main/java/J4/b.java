package J4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.Map;
import m4.C1560b0;
import n5.AbstractC1705a;
import n5.D;

/* loaded from: classes.dex */
public final class b implements F4.b {
    public static final Parcelable.Creator<b> CREATOR = new B5.c(17);

    /* renamed from: a, reason: collision with root package name */
    public final int f5517a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5518b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5519c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5520d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5521e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5522f;

    public b(int i7, int i10, String str, String str2, String str3, boolean z8) {
        AbstractC1705a.h(i10 == -1 || i10 > 0);
        this.f5517a = i7;
        this.f5518b = str;
        this.f5519c = str2;
        this.f5520d = str3;
        this.f5521e = z8;
        this.f5522f = i10;
    }

    public b(Parcel parcel) {
        this.f5517a = parcel.readInt();
        this.f5518b = parcel.readString();
        this.f5519c = parcel.readString();
        this.f5520d = parcel.readString();
        int i7 = D.f21141a;
        this.f5521e = parcel.readInt() != 0;
        this.f5522f = parcel.readInt();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b a(Map map) {
        boolean z8;
        int i7;
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean z10;
        List list5;
        int i10;
        List list6 = (List) map.get("icy-br");
        boolean z11 = true;
        int i11 = -1;
        if (list6 != null) {
            String str4 = (String) list6.get(0);
            try {
                i10 = Integer.parseInt(str4) * 1000;
                if (i10 > 0) {
                    z8 = true;
                } else {
                    try {
                        AbstractC1705a.S("IcyHeaders", "Invalid bitrate: " + str4);
                        z8 = false;
                        i10 = -1;
                    } catch (NumberFormatException unused) {
                        A3.c.q("Invalid bitrate header: ", str4, "IcyHeaders");
                        z8 = false;
                        i7 = i10;
                        list = (List) map.get("icy-genre");
                        if (list == null) {
                        }
                        list2 = (List) map.get("icy-name");
                        if (list2 == null) {
                        }
                        list3 = (List) map.get("icy-url");
                        if (list3 == null) {
                        }
                        list4 = (List) map.get("icy-pub");
                        if (list4 == null) {
                        }
                        list5 = (List) map.get("icy-metaint");
                        if (list5 != null) {
                        }
                        int i12 = i11;
                        if (z8) {
                        }
                    }
                }
            } catch (NumberFormatException unused2) {
                i10 = -1;
            }
            i7 = i10;
        } else {
            z8 = false;
            i7 = -1;
        }
        list = (List) map.get("icy-genre");
        if (list == null) {
            str = (String) list.get(0);
            z8 = true;
        } else {
            str = null;
        }
        list2 = (List) map.get("icy-name");
        if (list2 == null) {
            str2 = (String) list2.get(0);
            z8 = true;
        } else {
            str2 = null;
        }
        list3 = (List) map.get("icy-url");
        if (list3 == null) {
            str3 = (String) list3.get(0);
            z8 = true;
        } else {
            str3 = null;
        }
        list4 = (List) map.get("icy-pub");
        if (list4 == null) {
            z10 = ((String) list4.get(0)).equals("1");
            z8 = true;
        } else {
            z10 = false;
        }
        list5 = (List) map.get("icy-metaint");
        if (list5 != null) {
            String str5 = (String) list5.get(0);
            try {
                int parseInt = Integer.parseInt(str5);
                if (parseInt > 0) {
                    i11 = parseInt;
                } else {
                    try {
                        AbstractC1705a.S("IcyHeaders", "Invalid metadata interval: " + str5);
                        z11 = z8;
                    } catch (NumberFormatException unused3) {
                        i11 = parseInt;
                        A3.c.q("Invalid metadata interval: ", str5, "IcyHeaders");
                        int i122 = i11;
                        if (z8) {
                        }
                    }
                }
                z8 = z11;
            } catch (NumberFormatException unused4) {
            }
        }
        int i1222 = i11;
        if (z8) {
            return new b(i7, i1222, str, str2, str3, z10);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f5517a == bVar.f5517a && D.a(this.f5518b, bVar.f5518b) && D.a(this.f5519c, bVar.f5519c) && D.a(this.f5520d, bVar.f5520d) && this.f5521e == bVar.f5521e && this.f5522f == bVar.f5522f;
    }

    public final int hashCode() {
        int i7 = (527 + this.f5517a) * 31;
        String str = this.f5518b;
        int hashCode = (i7 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5519c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f5520d;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f5521e ? 1 : 0)) * 31) + this.f5522f;
    }

    @Override // F4.b
    public final void i(C1560b0 c1560b0) {
        String str = this.f5519c;
        if (str != null) {
            c1560b0.f20236E = str;
        }
        String str2 = this.f5518b;
        if (str2 != null) {
            c1560b0.f20234C = str2;
        }
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f5519c + "\", genre=\"" + this.f5518b + "\", bitrate=" + this.f5517a + ", metadataInterval=" + this.f5522f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f5517a);
        parcel.writeString(this.f5518b);
        parcel.writeString(this.f5519c);
        parcel.writeString(this.f5520d);
        int i10 = D.f21141a;
        parcel.writeInt(this.f5521e ? 1 : 0);
        parcel.writeInt(this.f5522f);
    }
}
