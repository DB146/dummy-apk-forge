package G8;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s extends o {

    /* renamed from: a, reason: collision with root package name */
    public final Serializable f4395a;

    public s(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f4395a = bool;
    }

    public s(Number number) {
        Objects.requireNonNull(number);
        this.f4395a = number;
    }

    public s(String str) {
        Objects.requireNonNull(str);
        this.f4395a = str;
    }

    public static boolean t(s sVar) {
        Serializable serializable = sVar.f4395a;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public final BigInteger b() {
        Serializable serializable = this.f4395a;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (t(this)) {
            return BigInteger.valueOf(i().longValue());
        }
        String o10 = o();
        I8.h.d(o10);
        return new BigInteger(o10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        Serializable serializable = this.f4395a;
        Serializable serializable2 = sVar.f4395a;
        if (serializable == null) {
            return serializable2 == null;
        }
        if (t(this) && t(sVar)) {
            return ((serializable instanceof BigInteger) || (serializable2 instanceof BigInteger)) ? b().equals(sVar.b()) : i().longValue() == sVar.i().longValue();
        }
        if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
            return serializable.equals(serializable2);
        }
        if ((serializable instanceof BigDecimal) && (serializable2 instanceof BigDecimal)) {
            return (serializable instanceof BigDecimal ? (BigDecimal) serializable : I8.h.i(o())).compareTo(serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : I8.h.i(sVar.o())) == 0;
        }
        double doubleValue = serializable instanceof Number ? i().doubleValue() : Double.parseDouble(o());
        double doubleValue2 = serializable2 instanceof Number ? sVar.i().doubleValue() : Double.parseDouble(sVar.o());
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.f4395a;
        if (serializable == null) {
            return 31;
        }
        if (t(this)) {
            doubleToLongBits = i().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(i().doubleValue());
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final Number i() {
        Serializable serializable = this.f4395a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new I8.j((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final String o() {
        Serializable serializable = this.f4395a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return i().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }
}
