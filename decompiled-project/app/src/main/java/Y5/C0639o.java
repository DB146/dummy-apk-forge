package Y5;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Objects;

/* renamed from: Y5.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0639o {

    /* renamed from: f, reason: collision with root package name */
    public static final C0639o f11857f = new C0639o((Boolean) null, 100, (Boolean) null, (String) null);

    /* renamed from: a, reason: collision with root package name */
    public final int f11858a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11859b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f11860c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11861d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumMap f11862e;

    public C0639o(Boolean bool, int i7, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(B0.class);
        this.f11862e = enumMap;
        enumMap.put((EnumMap) B0.AD_USER_DATA, (B0) (bool == null ? EnumC0663z0.UNINITIALIZED : bool.booleanValue() ? EnumC0663z0.GRANTED : EnumC0663z0.DENIED));
        this.f11858a = i7;
        this.f11859b = d();
        this.f11860c = bool2;
        this.f11861d = str;
    }

    public C0639o(EnumMap enumMap, int i7, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(B0.class);
        this.f11862e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f11858a = i7;
        this.f11859b = d();
        this.f11860c = bool;
        this.f11861d = str;
    }

    public static C0639o b(String str) {
        if (str == null || str.length() <= 0) {
            return f11857f;
        }
        String[] split = str.split(":");
        int parseInt = Integer.parseInt(split[0]);
        EnumMap enumMap = new EnumMap(B0.class);
        B0[] b0Arr = A0.DMA.f11204a;
        int length = b0Arr.length;
        int i7 = 1;
        int i10 = 0;
        while (i10 < length) {
            enumMap.put((EnumMap) b0Arr[i10], (B0) C0.e(split[i7].charAt(0)));
            i10++;
            i7++;
        }
        return new C0639o(enumMap, parseInt, (Boolean) null, (String) null);
    }

    public static C0639o c(int i7, Bundle bundle) {
        if (bundle == null) {
            return new C0639o((Boolean) null, i7, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(B0.class);
        for (B0 b02 : A0.DMA.f11204a) {
            enumMap.put((EnumMap) b02, (B0) C0.d(bundle.getString(b02.f11227a)));
        }
        return new C0639o(enumMap, i7, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public final EnumC0663z0 a() {
        EnumC0663z0 enumC0663z0 = (EnumC0663z0) this.f11862e.get(B0.AD_USER_DATA);
        return enumC0663z0 == null ? EnumC0663z0.UNINITIALIZED : enumC0663z0;
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f11858a);
        for (B0 b02 : A0.DMA.f11204a) {
            sb2.append(":");
            sb2.append(C0.h((EnumC0663z0) this.f11862e.get(b02)));
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0639o)) {
            return false;
        }
        C0639o c0639o = (C0639o) obj;
        if (this.f11859b.equalsIgnoreCase(c0639o.f11859b) && Objects.equals(this.f11860c, c0639o.f11860c)) {
            return Objects.equals(this.f11861d, c0639o.f11861d);
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.f11860c;
        int i7 = bool == null ? 3 : true != bool.booleanValue() ? 13 : 7;
        String str = this.f11861d;
        return ((str == null ? 17 : str.hashCode()) * 137) + this.f11859b.hashCode() + (i7 * 29);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(C0.a(this.f11858a));
        for (B0 b02 : A0.DMA.f11204a) {
            sb2.append(",");
            sb2.append(b02.f11227a);
            sb2.append("=");
            EnumC0663z0 enumC0663z0 = (EnumC0663z0) this.f11862e.get(b02);
            if (enumC0663z0 == null) {
                sb2.append("uninitialized");
            } else {
                int ordinal = enumC0663z0.ordinal();
                if (ordinal == 0) {
                    sb2.append("uninitialized");
                } else if (ordinal == 1) {
                    sb2.append("eu_consent_policy");
                } else if (ordinal == 2) {
                    sb2.append("denied");
                } else if (ordinal == 3) {
                    sb2.append("granted");
                }
            }
        }
        Boolean bool = this.f11860c;
        if (bool != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(bool);
        }
        String str = this.f11861d;
        if (str != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(str);
        }
        return sb2.toString();
    }
}
