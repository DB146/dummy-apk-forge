package v1;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class d implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24940a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f24941b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f24942c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f24943d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f24944e;

    public /* synthetic */ d(String str, Context context, Object obj, int i7, int i10) {
        this.f24940a = i10;
        this.f24941b = str;
        this.f24942c = context;
        this.f24944e = obj;
        this.f24943d = i7;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f24940a) {
            case 0:
                Object[] objArr = {(c) this.f24944e};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                return g.b(this.f24941b, this.f24942c, Collections.unmodifiableList(arrayList), this.f24943d);
            default:
                try {
                    return g.b(this.f24941b, this.f24942c, (List) this.f24944e, this.f24943d);
                } catch (Throwable unused) {
                    return new f(-3);
                }
        }
    }
}
