package v1;

import android.util.Base64;
import java.util.List;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f24935a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24936b;

    /* renamed from: c, reason: collision with root package name */
    public final String f24937c;

    /* renamed from: d, reason: collision with root package name */
    public final List f24938d;

    /* renamed from: e, reason: collision with root package name */
    public final String f24939e;

    public c(String str, String str2, String str3, List list) {
        this.f24935a = str;
        this.f24936b = str2;
        this.f24937c = str3;
        list.getClass();
        this.f24938d = list;
        this.f24939e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f24935a + ", mProviderPackage: " + this.f24936b + ", mQuery: " + this.f24937c + ", mCertificates:");
        int i7 = 0;
        while (true) {
            List list = this.f24938d;
            if (i7 >= list.size()) {
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            }
            sb2.append(" [");
            List list2 = (List) list.get(i7);
            for (int i10 = 0; i10 < list2.size(); i10++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list2.get(i10), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
            i7++;
        }
    }
}
