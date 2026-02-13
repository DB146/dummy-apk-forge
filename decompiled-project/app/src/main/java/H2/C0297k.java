package H2;

import K0.C0373c;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import e3.C1080e;
import java.util.Comparator;
import java.util.Map;
import java.util.WeakHashMap;
import y1.AbstractC2352B;
import z2.C2585a;

/* renamed from: H2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0297k implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C0297k f4735b = new C0297k(10);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4736a;

    public /* synthetic */ C0297k(int i7) {
        this.f4736a = i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x011d, code lost:
    
        if (r3 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0128, code lost:
    
        if (r3 != false) goto L52;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int i7 = 1;
        switch (this.f4736a) {
            case 0:
                return ((C0298l) obj).f4739a - ((C0298l) obj2).f4739a;
            case 1:
                C0306u c0306u = (C0306u) obj;
                C0306u c0306u2 = (C0306u) obj2;
                RecyclerView recyclerView = c0306u.f4837d;
                if ((recyclerView == null) == (c0306u2.f4837d == null)) {
                    boolean z8 = c0306u.f4834a;
                    if (z8 == c0306u2.f4834a) {
                        i7 = c0306u2.f4835b - c0306u.f4835b;
                        if (i7 == 0) {
                            int i10 = c0306u.f4836c - c0306u2.f4836c;
                            if (i10 != 0) {
                                return i10;
                            }
                            return 0;
                        }
                    }
                    return i7;
                }
                break;
            case 2:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 3:
                return q3.f.h(Integer.valueOf(((C0373c) obj).f5867b), Integer.valueOf(((C0373c) obj2).f5867b));
            case 4:
                return q3.f.h(Integer.valueOf(((C0373c) obj).f5867b), Integer.valueOf(((C0373c) obj2).f5867b));
            case 5:
                return q3.f.h((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 6:
                return q3.f.h((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 7:
                return q3.f.h(((P2.k) obj).f7799a, ((P2.k) obj2).f7799a);
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return q3.f.h(((P2.m) obj).f7810a, ((P2.m) obj2).f7810a);
            case 9:
                return ((T7.c) obj).compareTo((T7.c) obj2);
            case 10:
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return ((b1.f) obj).f13803b - ((b1.f) obj2).f13803b;
            case 12:
                return ((C1080e) obj).f16715b - ((C1080e) obj2).f16715b;
            case 13:
                return q3.f.h(Long.valueOf(((N9.a) obj).d()), Long.valueOf(((N9.a) obj2).d()));
            case 14:
                WeakHashMap weakHashMap = y1.K.f26642a;
                float g = AbstractC2352B.g((View) obj);
                float g2 = AbstractC2352B.g((View) obj2);
                if (g > g2) {
                    return -1;
                }
                return g < g2 ? 1 : 0;
            case 15:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 16:
                return q3.f.h(((sc.g) obj).f24372a, ((sc.g) obj2).f24372a);
            default:
                return ((C2585a) obj2).b() - ((C2585a) obj).b();
        }
    }
}
