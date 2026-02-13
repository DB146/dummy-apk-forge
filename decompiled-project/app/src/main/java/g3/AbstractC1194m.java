package g3;

import P4.C0463k;
import h3.H;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* renamed from: g3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1194m {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC1195n f17445a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [g3.n] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    static {
        ?? r12;
        try {
            r12 = new C0463k((WebViewProviderFactoryBoundaryInterface) tc.b.l(WebViewProviderFactoryBoundaryInterface.class, H.t()), 24);
        } catch (ClassNotFoundException unused) {
            r12 = new Object();
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
        f17445a = r12;
    }
}
