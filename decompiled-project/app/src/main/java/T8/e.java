package T8;

import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f9371a = Pattern.compile(",");

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f9372b;

    static {
        EnumSet of = EnumSet.of(P8.a.f8191z);
        EnumSet of2 = EnumSet.of(P8.a.f8185f);
        EnumSet of3 = EnumSet.of(P8.a.f8180a);
        EnumSet of4 = EnumSet.of(P8.a.f8190y);
        EnumSet of5 = EnumSet.of(P8.a.f8176C, P8.a.f8177D, P8.a.f8187v, P8.a.f8186u, P8.a.f8174A, P8.a.f8175B);
        EnumSet of6 = EnumSet.of(P8.a.f8182c, P8.a.f8183d, P8.a.f8184e, P8.a.f8188w, P8.a.f8181b);
        EnumSet copyOf = EnumSet.copyOf((Collection) of5);
        copyOf.addAll(of6);
        HashMap hashMap = new HashMap();
        f9372b = hashMap;
        hashMap.put("ONE_D_MODE", copyOf);
        hashMap.put("PRODUCT_MODE", of5);
        hashMap.put("QR_CODE_MODE", of);
        hashMap.put("DATA_MATRIX_MODE", of2);
        hashMap.put("AZTEC_MODE", of3);
        hashMap.put("PDF417_MODE", of4);
    }
}
