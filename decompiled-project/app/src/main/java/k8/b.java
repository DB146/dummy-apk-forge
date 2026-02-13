package k8;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import j8.InterfaceC1387b;
import java.lang.reflect.InvocationTargetException;
import l8.C1514c;
import y.S;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements InterfaceC1387b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19031a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19032b;

    public /* synthetic */ b(Object obj, int i7) {
        this.f19031a = i7;
        this.f19032b = obj;
    }

    @Override // j8.InterfaceC1387b
    public final Object get() {
        switch (this.f19031a) {
            case 0:
                return new C1514c((Y6.i) this.f19032b);
            case 1:
                String str = (String) this.f19032b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new RuntimeException("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(S.b("Could not instantiate ", str, "."), e2);
                } catch (InstantiationException e10) {
                    throw new RuntimeException(S.b("Could not instantiate ", str, "."), e10);
                } catch (NoSuchMethodException e11) {
                    throw new RuntimeException(X.c.t("Could not instantiate ", str), e11);
                } catch (InvocationTargetException e12) {
                    throw new RuntimeException(X.c.t("Could not instantiate ", str), e12);
                }
            default:
                return (ComponentRegistrar) this.f19032b;
        }
    }
}
