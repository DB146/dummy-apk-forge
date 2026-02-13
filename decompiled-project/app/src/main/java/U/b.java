package U;

import Eb.o;
import android.view.View;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import y1.AbstractC2352B;
import y1.K;

/* loaded from: classes.dex */
public final class b extends m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9387a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Collection f9388b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i7, Collection collection) {
        super(1);
        this.f9387a = i7;
        this.f9388b = collection;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        Collection<?> collection = this.f9388b;
        switch (this.f9387a) {
            case 0:
                return Boolean.valueOf(collection.contains(obj));
            case 1:
                return Boolean.valueOf(collection.contains(obj));
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                l.e(entry, "entry");
                View view = (View) entry.getValue();
                WeakHashMap weakHashMap = K.f26642a;
                return Boolean.valueOf(o.V(collection, AbstractC2352B.f(view)));
            default:
                return Boolean.valueOf(((List) obj).retainAll(collection));
        }
    }
}
