package v2;

import android.os.Bundle;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24991a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f24992b;

    public /* synthetic */ m(int i7, Bundle bundle) {
        this.f24991a = i7;
        this.f24992b = bundle;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        String argName = (String) obj;
        switch (this.f24991a) {
            case 0:
                kotlin.jvm.internal.l.e(argName, "argName");
                Bundle source = this.f24992b;
                kotlin.jvm.internal.l.e(source, "source");
                return Boolean.valueOf(!source.containsKey(argName));
            default:
                kotlin.jvm.internal.l.e(argName, "key");
                Bundle source2 = this.f24992b;
                kotlin.jvm.internal.l.e(source2, "source");
                return Boolean.valueOf(!source2.containsKey(argName));
        }
    }
}
