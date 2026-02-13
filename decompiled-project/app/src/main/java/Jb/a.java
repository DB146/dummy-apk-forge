package Jb;

import A0.G0;
import Db.q;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public abstract class a implements Hb.d, d, Serializable {
    private final Hb.d<Object> completion;

    public a(Hb.d dVar) {
        this.completion = dVar;
    }

    public Hb.d<q> create(Hb.d<?> completion) {
        l.e(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public Hb.d<q> create(Object obj, Hb.d<?> completion) {
        l.e(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // Jb.d
    public d getCallerFrame() {
        Hb.d<Object> dVar = this.completion;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public final Hb.d<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i7;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null) {
            return null;
        }
        int v10 = eVar.v();
        if (v10 > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v10 + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i7 = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i7 = -1;
        }
        int i10 = i7 >= 0 ? eVar.l()[i7] : -1;
        G0 g02 = f.f5769b;
        G0 g03 = f.f5768a;
        if (g02 == null) {
            try {
                G0 g04 = new G0(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 22);
                f.f5769b = g04;
                g02 = g04;
            } catch (Exception unused2) {
                f.f5769b = g03;
                g02 = g03;
            }
        }
        if (g02 != g03 && (method = (Method) g02.f27b) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = (Method) g02.f28c) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = (Method) g02.f29d;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = eVar.c();
        } else {
            str = str2 + '/' + eVar.c();
        }
        return new StackTraceElement(str, eVar.m(), eVar.f(), i10);
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Hb.d
    public final void resumeWith(Object obj) {
        Hb.d dVar = this;
        while (true) {
            a aVar = (a) dVar;
            Hb.d dVar2 = aVar.completion;
            l.b(dVar2);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == Ib.a.f5345a) {
                    return;
                }
            } catch (Throwable th) {
                obj = com.bumptech.glide.c.n(th);
            }
            aVar.releaseIntercepted();
            if (!(dVar2 instanceof a)) {
                dVar2.resumeWith(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }
}
