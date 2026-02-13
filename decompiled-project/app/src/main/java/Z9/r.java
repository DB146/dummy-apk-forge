package Z9;

import com.kt.apps.core.tv.model.TVChannelLinkStream;
import jb.InterfaceC1393d;

/* loaded from: classes2.dex */
public final class r implements InterfaceC1393d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12297a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f12298b;

    public /* synthetic */ r(s sVar, int i7) {
        this.f12297a = i7;
        this.f12298b = sVar;
    }

    @Override // jb.InterfaceC1393d
    public final void accept(Object obj) {
        switch (this.f12297a) {
            case 0:
                TVChannelLinkStream it = (TVChannelLinkStream) obj;
                kotlin.jvm.internal.l.e(it, "it");
                String message = "getTVFromDetail: " + it;
                s t5 = this.f12298b;
                kotlin.jvm.internal.l.e(t5, "t");
                kotlin.jvm.internal.l.e(message, "message");
                return;
            default:
                kotlin.jvm.internal.l.e((Throwable) obj, "it");
                s t10 = this.f12298b;
                kotlin.jvm.internal.l.e(t10, "t");
                return;
        }
    }
}
