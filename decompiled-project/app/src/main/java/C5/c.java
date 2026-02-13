package C5;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ c f2915b = new c(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2916a;

    public /* synthetic */ c(int i7) {
        this.f2916a = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2916a) {
            case 0:
                return ((Scope) obj).f14891b.compareTo(((Scope) obj2).f14891b);
            default:
                return ((Scope) obj).f14891b.compareTo(((Scope) obj2).f14891b);
        }
    }
}
