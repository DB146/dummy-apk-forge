package bc;

import Z9.x;
import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: bc.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0851c {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0851c f13997b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0851c f13998c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0851c f13999d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0851c f14000e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0851c f14001f;

    /* renamed from: u, reason: collision with root package name */
    public static final EnumC0851c f14002u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ EnumC0851c[] f14003v;

    /* renamed from: a, reason: collision with root package name */
    public final TimeUnit f14004a;

    static {
        EnumC0851c enumC0851c = new EnumC0851c("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f13997b = enumC0851c;
        EnumC0851c enumC0851c2 = new EnumC0851c("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        EnumC0851c enumC0851c3 = new EnumC0851c("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f13998c = enumC0851c3;
        EnumC0851c enumC0851c4 = new EnumC0851c("SECONDS", 3, TimeUnit.SECONDS);
        f13999d = enumC0851c4;
        EnumC0851c enumC0851c5 = new EnumC0851c("MINUTES", 4, TimeUnit.MINUTES);
        f14000e = enumC0851c5;
        EnumC0851c enumC0851c6 = new EnumC0851c("HOURS", 5, TimeUnit.HOURS);
        f14001f = enumC0851c6;
        EnumC0851c enumC0851c7 = new EnumC0851c("DAYS", 6, TimeUnit.DAYS);
        f14002u = enumC0851c7;
        EnumC0851c[] enumC0851cArr = {enumC0851c, enumC0851c2, enumC0851c3, enumC0851c4, enumC0851c5, enumC0851c6, enumC0851c7};
        f14003v = enumC0851cArr;
        x.k(enumC0851cArr);
    }

    public EnumC0851c(String str, int i7, TimeUnit timeUnit) {
        this.f14004a = timeUnit;
    }

    public static EnumC0851c valueOf(String str) {
        return (EnumC0851c) Enum.valueOf(EnumC0851c.class, str);
    }

    public static EnumC0851c[] values() {
        return (EnumC0851c[]) f14003v.clone();
    }
}
