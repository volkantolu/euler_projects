package undoredo;

import java.io.Serializable;

interface Location extends Serializable
{
    public String getLocation();
    public void setLocation(String newLocation);
}
