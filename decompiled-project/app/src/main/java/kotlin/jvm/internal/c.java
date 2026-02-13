package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class c implements Yb.b, Serializable {
    public static final Object NO_RECEIVER = b.f19124a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient Yb.b reflected;
    private final String signature;

    public c(Object obj, Class cls, String str, String str2, boolean z8) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z8;
    }

    @Override // Yb.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // Yb.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public Yb.b compute() {
        Yb.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        Yb.b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract Yb.b computeReflected();

    @Override // Yb.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // Yb.b
    public String getName() {
        return this.name;
    }

    public Yb.d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return w.a(cls);
        }
        w.f19135a.getClass();
        return new p(cls);
    }

    @Override // Yb.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract Yb.b getReflected();

    @Override // Yb.b
    public Yb.i getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // Yb.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // Yb.b
    public Yb.j getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // Yb.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // Yb.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // Yb.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
