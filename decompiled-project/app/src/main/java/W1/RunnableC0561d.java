package W1;

import android.view.View;

/* renamed from: W1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0561d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10460a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0573p f10461b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o0 f10462c;

    public /* synthetic */ RunnableC0561d(C0573p c0573p, o0 o0Var, int i7) {
        this.f10460a = i7;
        this.f10461b = c0573p;
        this.f10462c = o0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10460a) {
            case 0:
                C0573p this$0 = this.f10461b;
                kotlin.jvm.internal.l.e(this$0, "this$0");
                o0 operation = this.f10462c;
                kotlin.jvm.internal.l.e(operation, "$operation");
                this$0.a(operation);
                return;
            case 1:
                C0573p this$02 = this.f10461b;
                kotlin.jvm.internal.l.e(this$02, "this$0");
                o0 o0Var = this.f10462c;
                if (this$02.f10541b.contains(o0Var)) {
                    int i7 = o0Var.f10531a;
                    View view = o0Var.f10533c.f10277U;
                    kotlin.jvm.internal.l.d(view, "operation.fragment.mView");
                    A3.c.a(i7, view, this$02.f10540a);
                    return;
                }
                return;
            default:
                C0573p this$03 = this.f10461b;
                kotlin.jvm.internal.l.e(this$03, "this$0");
                o0 o0Var2 = this.f10462c;
                this$03.f10541b.remove(o0Var2);
                this$03.f10542c.remove(o0Var2);
                return;
        }
    }
}
