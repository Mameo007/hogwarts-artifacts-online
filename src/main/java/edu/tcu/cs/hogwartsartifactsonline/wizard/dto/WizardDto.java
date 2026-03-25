package edu.tcu.cs.hogwartsartifactsonline.wizard.dto;

import edu.tcu.cs.hogwartsartifactsonline.wizard.Wizard;

public class WizardDto(Integer id,
                       String name,
                       Integer numberOfArtifacts) {

    @Override
    public WizardDto convert(Wizard source) {
        WizardDto wizardDto = new WizardDto(source.getId(), source.getName(), source.getNumberOfArtifacts());
    }
}
