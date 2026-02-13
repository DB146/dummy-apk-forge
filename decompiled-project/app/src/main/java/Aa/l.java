package Aa;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR;

    /* renamed from: a, reason: collision with root package name */
    public static final l f1523a;

    /* renamed from: b, reason: collision with root package name */
    public static final l f1524b;

    /* renamed from: c, reason: collision with root package name */
    public static final l f1525c;

    /* renamed from: d, reason: collision with root package name */
    public static final l f1526d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ l[] f1527e;

    /* JADX WARN: Type inference failed for: r0v0, types: [Aa.l, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.os.Parcelable$Creator<Aa.l>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [Aa.l, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [Aa.l, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [Aa.l, java.lang.Enum] */
    static {
        ?? r02 = new Enum("TV", 0);
        f1523a = r02;
        ?? r12 = new Enum("FOOTBALL", 1);
        f1524b = r12;
        ?? r22 = new Enum("RADIO", 2);
        f1525c = r22;
        ?? r32 = new Enum("EXTENSION", 3);
        f1526d = r32;
        l[] lVarArr = {r02, r12, r22, r32};
        f1527e = lVarArr;
        Z9.x.k(lVarArr);
        CREATOR = new Object();
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f1527e.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.l.e(dest, "dest");
        dest.writeString(name());
    }
}
