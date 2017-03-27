package mt2.command.ex2;

import java.io.Serializable;

interface Location extends Serializable
{
    public String getLocation();
    public void setLocation(String newLocation);
}
