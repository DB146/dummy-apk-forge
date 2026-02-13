package Y5;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class C0 {

    /* renamed from: c, reason: collision with root package name */
    public static final C0 f11229c = new C0(100);

    /* renamed from: a, reason: collision with root package name */
    public final EnumMap f11230a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11231b;

    public C0(int i7) {
        EnumMap enumMap = new EnumMap(B0.class);
        this.f11230a = enumMap;
        B0 b02 = B0.AD_STORAGE;
        EnumC0663z0 enumC0663z0 = EnumC0663z0.UNINITIALIZED;
        enumMap.put((EnumMap) b02, (B0) enumC0663z0);
        enumMap.put((EnumMap) B0.ANALYTICS_STORAGE, (B0) enumC0663z0);
        this.f11231b = i7;
    }

    public C0(EnumMap enumMap, int i7) {
        EnumMap enumMap2 = new EnumMap(B0.class);
        this.f11230a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f11231b = i7;
    }

    public static String a(int i7) {
        return i7 != -30 ? i7 != -20 ? i7 != -10 ? i7 != 0 ? i7 != 30 ? i7 != 90 ? i7 != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static C0 b(int i7, Bundle bundle) {
        if (bundle == null) {
            return new C0(i7);
        }
        EnumMap enumMap = new EnumMap(B0.class);
        for (B0 b02 : A0.STORAGE.f11204a) {
            enumMap.put((EnumMap) b02, (B0) d(bundle.getString(b02.f11227a)));
        }
        return new C0(enumMap, i7);
    }

    public static C0 c(int i7, String str) {
        EnumMap enumMap = new EnumMap(B0.class);
        A0 a02 = A0.STORAGE;
        int i10 = 0;
        while (true) {
            B0[] b0Arr = a02.f11204a;
            if (i10 >= b0Arr.length) {
                return new C0(enumMap, i7);
            }
            String str2 = str == null ? "" : str;
            B0 b02 = b0Arr[i10];
            int i11 = i10 + 2;
            if (i11 < str2.length()) {
                enumMap.put((EnumMap) b02, (B0) e(str2.charAt(i11)));
            } else {
                enumMap.put((EnumMap) b02, (B0) EnumC0663z0.UNINITIALIZED);
            }
            i10++;
        }
    }

    public static EnumC0663z0 d(String str) {
        EnumC0663z0 enumC0663z0 = EnumC0663z0.UNINITIALIZED;
        return str == null ? enumC0663z0 : str.equals("granted") ? EnumC0663z0.GRANTED : str.equals("denied") ? EnumC0663z0.DENIED : enumC0663z0;
    }

    public static EnumC0663z0 e(char c10) {
        return c10 != '+' ? c10 != '0' ? c10 != '1' ? EnumC0663z0.UNINITIALIZED : EnumC0663z0.GRANTED : EnumC0663z0.DENIED : EnumC0663z0.POLICY;
    }

    public static char h(EnumC0663z0 enumC0663z0) {
        if (enumC0663z0 == null) {
            return '-';
        }
        int ordinal = enumC0663z0.ordinal();
        if (ordinal == 1) {
            return '+';
        }
        if (ordinal != 2) {
            return ordinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean l(int i7, int i10) {
        int i11 = -30;
        if (i7 == -20) {
            if (i10 == -30) {
                return true;
            }
            i7 = -20;
        }
        if (i7 != -30) {
            i11 = i7;
        } else if (i10 == -20) {
            return true;
        }
        return i11 == i10 || i7 < i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0)) {
            return false;
        }
        C0 c02 = (C0) obj;
        for (B0 b02 : A0.STORAGE.f11204a) {
            if (this.f11230a.get(b02) != c02.f11230a.get(b02)) {
                return false;
            }
        }
        return this.f11231b == c02.f11231b;
    }

    public final String f() {
        int ordinal;
        StringBuilder sb2 = new StringBuilder("G1");
        for (B0 b02 : A0.STORAGE.f11204a) {
            EnumC0663z0 enumC0663z0 = (EnumC0663z0) this.f11230a.get(b02);
            char c10 = '-';
            if (enumC0663z0 != null && (ordinal = enumC0663z0.ordinal()) != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        c10 = '0';
                    } else if (ordinal != 3) {
                    }
                }
                c10 = '1';
            }
            sb2.append(c10);
        }
        return sb2.toString();
    }

    public final String g() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (B0 b02 : A0.STORAGE.f11204a) {
            sb2.append(h((EnumC0663z0) this.f11230a.get(b02)));
        }
        return sb2.toString();
    }

    public final int hashCode() {
        Iterator it = this.f11230a.values().iterator();
        int i7 = this.f11231b * 17;
        while (it.hasNext()) {
            i7 = (i7 * 31) + ((EnumC0663z0) it.next()).hashCode();
        }
        return i7;
    }

    public final boolean i(B0 b02) {
        return ((EnumC0663z0) this.f11230a.get(b02)) != EnumC0663z0.DENIED;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0 j(C0 c02) {
        EnumMap enumMap = new EnumMap(B0.class);
        for (B0 b02 : A0.STORAGE.f11204a) {
            EnumC0663z0 enumC0663z0 = (EnumC0663z0) this.f11230a.get(b02);
            EnumC0663z0 enumC0663z02 = (EnumC0663z0) c02.f11230a.get(b02);
            if (enumC0663z0 != null) {
                if (enumC0663z02 != null) {
                    EnumC0663z0 enumC0663z03 = EnumC0663z0.UNINITIALIZED;
                    if (enumC0663z0 != enumC0663z03) {
                        if (enumC0663z02 != enumC0663z03) {
                            EnumC0663z0 enumC0663z04 = EnumC0663z0.POLICY;
                            if (enumC0663z0 != enumC0663z04) {
                                if (enumC0663z02 != enumC0663z04) {
                                    EnumC0663z0 enumC0663z05 = EnumC0663z0.DENIED;
                                    enumC0663z0 = (enumC0663z0 == enumC0663z05 || enumC0663z02 == enumC0663z05) ? enumC0663z05 : EnumC0663z0.GRANTED;
                                }
                            }
                        }
                    }
                }
                if (enumC0663z0 == null) {
                    enumMap.put((EnumMap) b02, (B0) enumC0663z0);
                }
            }
            enumC0663z0 = enumC0663z02;
            if (enumC0663z0 == null) {
            }
        }
        return new C0(enumMap, 100);
    }

    public final C0 k(C0 c02) {
        EnumMap enumMap = new EnumMap(B0.class);
        for (B0 b02 : A0.STORAGE.f11204a) {
            EnumC0663z0 enumC0663z0 = (EnumC0663z0) this.f11230a.get(b02);
            if (enumC0663z0 == EnumC0663z0.UNINITIALIZED) {
                enumC0663z0 = (EnumC0663z0) c02.f11230a.get(b02);
            }
            if (enumC0663z0 != null) {
                enumMap.put((EnumMap) b02, (B0) enumC0663z0);
            }
        }
        return new C0(enumMap, this.f11231b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(a(this.f11231b));
        for (B0 b02 : A0.STORAGE.f11204a) {
            sb2.append(",");
            sb2.append(b02.f11227a);
            sb2.append("=");
            EnumC0663z0 enumC0663z0 = (EnumC0663z0) this.f11230a.get(b02);
            if (enumC0663z0 == null) {
                enumC0663z0 = EnumC0663z0.UNINITIALIZED;
            }
            sb2.append(enumC0663z0);
        }
        return sb2.toString();
    }
}
